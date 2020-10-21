module com.rest.web {
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires com.service.dataService;
    requires spring.web;
    requires spring.beans;
    requires com.fasterxml.jackson.core;

    opens com.web.rest to spring.core;

    exports com.web.rest to spring.beans, spring.context, spring.web;
}