package net.petriv.basepatterns.creational.builder;

public class EnterpriceWebsiteBuilder extends WebsiteBuilder {

    @Override
    void buildName() {
        website.setName("Enterprice web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALTFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
