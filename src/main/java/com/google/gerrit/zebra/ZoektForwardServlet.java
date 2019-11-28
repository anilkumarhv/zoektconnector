package com.google.gerrit.zebra;

import com.google.gerrit.extensions.annotations.PluginCanonicalWebUrl;
import com.google.gerrit.extensions.annotations.PluginName;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Singleton
public class ZoektForwardServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(ZoektForwardServlet.class);

    @Inject
    ZoektForwardServlet(@PluginName String pluginName, @PluginCanonicalWebUrl String url) {
        logger.info(String.format("ZoektForwardServlet Plugin '%s' at url %s", pluginName, url));
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
        forwardRequest(Constants.GET, req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) {
        forwardRequest(Constants.POST, req, resp);
    }

    private void forwardRequest(String method, HttpServletRequest req, HttpServletResponse resp) {
        final boolean hasoutbody = (method.equals(Constants.POST));
        req.getUserPrincipal();
    }

}
