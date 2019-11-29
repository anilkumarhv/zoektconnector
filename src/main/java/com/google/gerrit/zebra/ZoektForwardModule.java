package com.google.gerrit.zebra;

import com.google.gerrit.httpd.plugins.HttpPluginModule;
import com.google.inject.servlet.ServletModule;

public class ZoektForwardModule extends HttpPluginModule {
    @Override
    protected void configureServlets() {
//        super.configureServlets();
//        serve("/hello").with(ZoektForwardServlet.class);
        bind(ZoektForwardServlet.class);
    }
}
