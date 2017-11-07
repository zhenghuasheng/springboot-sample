package com.sample.config.security;

/**
 * 配置jetty同时支持http和https
 * @author zhenghuasheng
 * @date 2017/11/7.15:12
 */
//@Configuration
public class Http2HttpsConfig {

//    @Bean
//    public EmbeddedServletContainerCustomizer servletContainerCustomizer() {
//        return new EmbeddedServletContainerCustomizer() {
//            @Override
//            public void customize(ConfigurableEmbeddedServletContainer container) {
//                if (container instanceof JettyEmbeddedServletContainerFactory) {
//                    customizeJetty((JettyEmbeddedServletContainerFactory) container);
//                }
//            }
//
//            private void customizeJetty(JettyEmbeddedServletContainerFactory container) {
//                container.addServerCustomizers((Server server) -> {
//                    // HTTP
//                    ServerConnector connector = new ServerConnector(server);
//                    connector.setPort(9999);
//
//                    // HTTPS
//                    SslContextFactory sslContextFactory = new SslContextFactory();
//                    sslContextFactory.setKeyStorePath(properties.getKeystoreFile());
//                    sslContextFactory.setKeyStorePassword(properties.getKeystorePassword());
//
//                    HttpConfiguration config = new HttpConfiguration();
//                    config.setSecureScheme(HttpScheme.HTTPS.asString());
//                    config.addCustomizer(new SecureRequestCustomizer());
//
//                    ServerConnector sslConnector = new ServerConnector(
//                            server,
//                            new SslConnectionFactory(sslContextFactory, HttpVersion.HTTP_1_1.asString()),
//                            new HttpConnectionFactory(config));
//                    sslConnector.setPort(properties.getPort());
//                    server.setConnectors(new Connector[]{connector, sslConnector});
//                });
//            }
//        };
//    }
}
