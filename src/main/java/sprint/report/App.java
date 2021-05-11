package sprint.report;

import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.temporal.ChronoField.DAY_OF_MONTH;
import static java.time.temporal.ChronoField.MONTH_OF_YEAR;
import static java.time.temporal.ChronoField.YEAR;

public class App {
    private static final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();


    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        mapperFactory.classMap(SprintReport.class, SprintReportDto.class)
                .byDefault()
                .customize(new CustomMapper<SprintReport, SprintReportDto>() {
                    @Override
                    public void mapAtoB(SprintReport report, SprintReportDto dto, MappingContext context) {
                        dto.setCreatedDate(formatter(report.getCreatedDate()));
                        dto.setModifiedDate(formatter(report.getModifiedDate()));
                        dto.setStaus(report.getStaus().toString());
                    }
                })
                .register();

        /*SprintReportDto test = test(createSprint());

        System.out.println(test.toString());*/
        /*List<SprintReport> listOfSprints = createListOfSprints().stream()
                .sorted((o1, o2) -> o1.getCreatedDate().compareTo(o2.getCreatedDate()))
                .collect(Collectors.toList());

        test2(listOfSprints).forEach(e -> System.out.println(e.toString()));*/

        Optional<String> optional = Optional.of(null);
        optional.ifPresent(System.out::println);


        createListOfSprints().forEach(r -> System.out.println(getString(r)));
    }

    public static List<String> getString(SprintReport sprintReport) {
        switch (sprintReport.getStaus()) {
            case SENT:
            case DRAFT:
                return Arrays.asList("Sent", "Draft");
            case COMPLETED:
                return Arrays.asList("Completed");
            default:
                return new ArrayList<>();

        }
    }

    public static SprintReportDto test(SprintReport report) {
        MapperFacade facade  = mapperFactory.getMapperFacade();

        SprintReportDto map = facade.map(report, SprintReportDto.class);
        return map;
    }

    public static List<SprintReportDto> test2(List<SprintReport> reports) {
        MapperFacade facade  = mapperFactory.getMapperFacade();

        return reports.stream()
                .map(e -> facade.map(e, SprintReportDto.class))
                .collect(Collectors.toList());
    }

    private static String formatter(LocalDateTime time) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendValue(DAY_OF_MONTH, 2)
                .appendLiteral(".")
                .appendValue(MONTH_OF_YEAR, 2)
                .appendLiteral(".")
                .appendValue(YEAR, 4).optionalStart()
                .parseLenient()
                .parseStrict()
                .toFormatter();

        return time.format(formatter).toString();
    }

    private static SprintReport createSprint()  {
        return SprintReport.builder()
                .id(1L)
                .title("Sprint report")
                .staus(SprintReportStaus.DRAFT)
                .createdDate(LocalDateTime.now())
                .modifiedDate(LocalDateTime.now())
                .someInfo("not important")
                .build();
    }

    private static List<SprintReport> createListOfSprints() {
        return Stream.of(SprintReport.builder()
                .id(1L)
                .title("Sprint report 1")
                .staus(SprintReportStaus.DRAFT)
                .createdDate(LocalDateTime.now())
                .modifiedDate(LocalDateTime.now())
                .someInfo("not important")
                .build(), SprintReport.builder()
                .id(2L)
                .title("Sprint report 2")
                .staus(SprintReportStaus.IN_REVIEW)
                .createdDate(LocalDateTime.now().minusYears(1))
                .modifiedDate(LocalDateTime.now())
                .someInfo("not important")
                .build(), SprintReport.builder()
                .id(2L)
                .title("Sprint report 3")
                .staus(SprintReportStaus.COMPLETED)
                .createdDate(LocalDateTime.now().minusYears(1))
                .modifiedDate(LocalDateTime.now())
                .someInfo("not important3")
                .build()).collect(Collectors.toList());
    }
}
