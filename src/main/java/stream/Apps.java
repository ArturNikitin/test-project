package stream;

import com.google.gson.Gson;
import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Apps {
    private static final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
    private static final Gson gson = new Gson();
    private static final MapperFacade mapper = mapperFactory.getMapperFacade();
    private static Swot swot;
    private static SwotNotes swotNotes1;
    private static SwotNotes swotNotes2;
    private static SwotNotes swotNotes3;
    private static SwotNotes swotNotes4;

    public static void main(String[] args) {

        swotNotes1 = SwotNotes.builder()
                .id(1L)
                .category(SwotCategory.WEAKNESS)
                .value("Lorem")
                .build();
        swotNotes2 = SwotNotes.builder()
                .id(2L)
                .category(SwotCategory.STRENGTH)
                .value("Lorem isum")
                .build();
        swotNotes3 = SwotNotes.builder()
                .id(3L)
                .category(SwotCategory.OPPORTUNITY)
                .value("Lorem ipsum Lorem Palmer")
                .build();
        swotNotes4 = SwotNotes.builder()
                .id(4L)
                .category(SwotCategory.WEAKNESS)
                .value("Lorem Lorem Dolmer")
                .build();


        Swot swot = Swot.builder()
                .id(1L)
                .url("randomURL")
                .notes(Arrays.asList(swotNotes1, swotNotes2, swotNotes3, swotNotes4))
                .build();

        Swot swot1 = Swot.builder()
                .id(2L)
                .url("secondUrl")
                .notes(Arrays.asList(swotNotes3, swotNotes4))
                .build();

        SwotDto swotDto = mapper.map(swot, SwotDto.class);

//        System.out.println(gson.toJson(swotDto));

        List<Swot> swots = Arrays.asList(swot, swot1);
        List<SwotDto> swotDtos = swots.stream()
                .map(s -> mapper.map(s, SwotDto.class))
                .collect(Collectors.toList());

        swotDtos.forEach(s -> System.out.println(gson.toJson(s)));

        swotDtos.stream()
                .map(s -> mapper.map(s, Swot.class))
                .forEach(System.out::println);
    }
}
