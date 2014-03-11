package metricton

import grails.rest.Resource

// http://grails.org/doc/2.3.7/guide/webServices.html#REST
// run-app
// http://localhost:8080/metricton/metric.json
// TODO-DLN: lots of curl to see how this works
@Resource(uri='/metric')
class Metric {

    String path
    String alias
    String dispositionLabel
    String metricValueLabel

    static constraints = {
        path blank: false
        alias blank: false
        dispositionLabel blank: false
        metricValueLabel blank: false
    }
}
