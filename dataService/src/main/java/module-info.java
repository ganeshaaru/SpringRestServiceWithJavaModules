module com.service.dataService {
    requires java.base;
    requires spring.context;

    opens com.service.data to spring.core;
    opens com.service.config to spring.core;

    exports com.service.data to com.rest.web, spring.beans;
    exports com.service.config to com.rest.web, spring.beans, spring.context;
}