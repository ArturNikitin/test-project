package sprint.report;

public enum SprintReportStaus {
    COMPLETED, SENT, IN_REVIEW, DRAFT;


    @Override
    public String toString() {
        return this.name().substring(0, 1) + this.name().substring(1).toLowerCase();
    }
}
