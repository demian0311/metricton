package metricton

class Current {

    String disposition
    String metricValue
    String eventTime

    static belongsTo = [metric: Metric]

    static constraints = {
    }
}
