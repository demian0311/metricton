import metricton.Metric

class BootStrap {

    def init = { servletContext ->
        new Metric(
                path:"foo.bar",
                alias: "foo",
                dispositionLabel: "foo",
                metricValueLabel: "foo"
            ).save(flush: true)
    }
    def destroy = {
    }
}
