package com.sample.config.security;

/**
 * 配置jetty同时支持http和https
 * @author zhenghuasheng
 * @date 2017/11/7.15:12
 */
//@Configuration
public class Http2HttpsConfig {
//
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
//                container.addServerCustomizers(new JettyServerCustomizer() {
//                    @Override
//                    public void customize(Server server) {
//                        // HTTP
//                        ServerConnector connector = new ServerConnector(server);
//                        connector.setPort(8090);
//
//                        // HTTPS
//                        SslContextFactory sslContextFactory = new SslContextFactory();
//                        sslContextFactory.setKeyStorePath("E:\\other\\springboot-sample\\src\\main\\resources\\slfe_keystore.p12");
//                        sslContextFactory.setKeyStorePassword("123456");
//                        sslContextFactory.setKeyStoreType("PKCS12");
//
//                        HttpConfiguration config = new HttpConfiguration();
//                        config.setSecureScheme(HttpScheme.HTTPS.asString());
//                        config.setSecurePort(9999);
//                        config.addCustomizer(new SecureRequestCustomizer());
//
//
//                        ServerConnector sslConnector = new ServerConnector(server,
//                                new SslConnectionFactory(sslContextFactory, HttpVersion.HTTP_1_1.asString()),
//                                new HttpConnectionFactory(config));
//                        sslConnector.setPort(9999);
//
//                        server.setConnectors(new Connector[]{connector, sslConnector});
//                    }
//                });
//            }
//        };
//    }
}
