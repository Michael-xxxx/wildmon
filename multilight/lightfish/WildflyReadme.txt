{
    "launch-type" : "STANDALONE",
    "management-major-version" : 2,
    "management-micro-version" : 0,
    "management-minor-version" : 2,
    "name" : "delllat6410",
    "namespaces" : [],
    "process-type" : "Server",
    "product-name" : null,
    "product-version" : null,
    "profile-name" : null,
    "release-codename" : "Tweek",
    "release-version" : "8.2.0.Final",
    "running-mode" : "NORMAL",
    "schema-locations" : [],
    "server-state" : "running",
    "core-service" : {
        "management" : {
            "access" : {
                "authorization" : {
                    "all-role-names" : [
                        "Operator",
                        "Maintainer",
                        "Auditor",
                        "Monitor",
                        "Administrator",
                        "SuperUser",
                        "Deployer"
                    ],
                    "permission-combination-policy" : "permissive",
                    "provider" : "simple",
                    "standard-role-names" : [
                        "Monitor",
                        "Operator",
                        "Maintainer",
                        "Deployer",
                        "Administrator",
                        "Auditor",
                        "SuperUser"
                    ],
                    "constraint" : {
                        "application-classification" : {"type" : {
                            "core" : {"classification" : {"deployment" : {
                                "configured-application" : null,
                                "default-application" : true,
                                "applies-to" : {
                                    "/deployment=*" : {
                                        "address" : "/deployment=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    },
                                    "/deployment-overlay=*" : {
                                        "address" : "/deployment-overlay=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    },
                                    "/" : {
                                        "address" : "/",
                                        "attributes" : [],
                                        "entire-resource" : false,
                                        "operations" : [
                                            "full-replace-deployment",
                                            "upload-deployment-stream",
                                            "upload-deployment-bytes",
                                            "upload-deployment-url"
                                        ]
                                    }
                                }
                            }}},
                            "datasources" : {"classification" : {
                                "data-source" : {
                                    "configured-application" : null,
                                    "default-application" : false,
                                    "applies-to" : {
                                        "/subsystem=datasources/data-source=ExampleDS" : {
                                            "address" : "/subsystem=datasources/data-source=ExampleDS",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=datasources/data-source=*" : {
                                            "address" : "/subsystem=datasources/data-source=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=datasources/data-source=DerbyDS" : {
                                            "address" : "/subsystem=datasources/data-source=DerbyDS",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=datasources/data-source=*" : {
                                            "address" : "/deployment=*/subsystem=datasources/data-source=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=datasources/data-source=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=datasources/data-source=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        }
                                    }
                                },
                                "jdbc-driver" : {
                                    "configured-application" : null,
                                    "default-application" : false,
                                    "applies-to" : {"/subsystem=datasources/jdbc-driver=*" : {
                                        "address" : "/subsystem=datasources/jdbc-driver=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                },
                                "xa-data-source" : {
                                    "configured-application" : null,
                                    "default-application" : false,
                                    "applies-to" : {
                                        "/deployment=*/subsystem=datasources/xa-data-source=*" : {
                                            "address" : "/deployment=*/subsystem=datasources/xa-data-source=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=datasources/xa-data-source=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=datasources/xa-data-source=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=datasources/xa-data-source=*" : {
                                            "address" : "/subsystem=datasources/xa-data-source=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        }
                                    }
                                }
                            }},
                            "logging" : {"classification" : {
                                "logger" : {
                                    "configured-application" : null,
                                    "default-application" : false,
                                    "applies-to" : {
                                        "/subsystem=logging/logger=*" : {
                                            "address" : "/subsystem=logging/logger=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=logging/logging-profile=*/logger=*" : {
                                            "address" : "/subsystem=logging/logging-profile=*/logger=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        }
                                    }
                                },
                                "logging-profile" : {
                                    "configured-application" : null,
                                    "default-application" : false,
                                    "applies-to" : {"/subsystem=logging/logging-profile=*" : {
                                        "address" : "/subsystem=logging/logging-profile=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                }
                            }},
                            "mail" : {"classification" : {"mail-session" : {
                                "configured-application" : null,
                                "default-application" : false,
                                "applies-to" : {"/subsystem=mail/mail-session=*" : {
                                    "address" : "/subsystem=mail/mail-session=*",
                                    "attributes" : [],
                                    "entire-resource" : true,
                                    "operations" : []
                                }}
                            }}},
                            "messaging" : {"classification" : {
                                "jms-queue" : {
                                    "configured-application" : null,
                                    "default-application" : false,
                                    "applies-to" : {
                                        "/subsystem=messaging/hornetq-server=*/jms-queue=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/jms-queue=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=messaging/hornetq-server=*/jms-queue=*" : {
                                            "address" : "/deployment=*/subsystem=messaging/hornetq-server=*/jms-queue=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*/jms-queue=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*/jms-queue=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        }
                                    }
                                },
                                "jms-topic" : {
                                    "configured-application" : null,
                                    "default-application" : false,
                                    "applies-to" : {
                                        "/deployment=*/subsystem=messaging/hornetq-server=*/jms-topic=*" : {
                                            "address" : "/deployment=*/subsystem=messaging/hornetq-server=*/jms-topic=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*/jms-topic=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*/jms-topic=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/jms-topic=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/jms-topic=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        }
                                    }
                                },
                                "queue" : {
                                    "configured-application" : null,
                                    "default-application" : false,
                                    "applies-to" : {"/subsystem=messaging/hornetq-server=*/queue=*" : {
                                        "address" : "/subsystem=messaging/hornetq-server=*/queue=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                },
                                "security-setting" : {
                                    "configured-application" : null,
                                    "default-application" : false,
                                    "applies-to" : {"/subsystem=messaging/hornetq-server=*/security-setting=*" : {
                                        "address" : "/subsystem=messaging/hornetq-server=*/security-setting=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                }
                            }},
                            "naming" : {"classification" : {"binding" : {
                                "configured-application" : null,
                                "default-application" : false,
                                "applies-to" : {"/subsystem=naming/binding=*" : {
                                    "address" : "/subsystem=naming/binding=*",
                                    "attributes" : [],
                                    "entire-resource" : true,
                                    "operations" : []
                                }}
                            }}},
                            "resource-adapters" : {"classification" : {"resource-adapter" : {
                                "configured-application" : null,
                                "default-application" : false,
                                "applies-to" : {"/subsystem=resource-adapters/resource-adapter=*" : {
                                    "address" : "/subsystem=resource-adapters/resource-adapter=*",
                                    "attributes" : [],
                                    "entire-resource" : true,
                                    "operations" : []
                                }}
                            }}},
                            "security" : {"classification" : {"security-domain" : {
                                "configured-application" : null,
                                "default-application" : false,
                                "applies-to" : {"/subsystem=security/security-domain=*" : {
                                    "address" : "/subsystem=security/security-domain=*",
                                    "attributes" : [],
                                    "entire-resource" : true,
                                    "operations" : []
                                }}
                            }}}
                        }},
                        "sensitivity-classification" : {"type" : {
                            "core" : {"classification" : {
                                "access-control" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : true,
                                    "default-requires-read" : true,
                                    "default-requires-write" : true,
                                    "applies-to" : {
                                        "/subsystem=jmx" : {
                                            "address" : "/subsystem=jmx",
                                            "attributes" : ["non-core-mbean-sensitivity"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/core-service=management/access=authorization" : {
                                            "address" : "/core-service=management/access=authorization",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        }
                                    }
                                },
                                "credential" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : true,
                                    "default-requires-write" : true,
                                    "applies-to" : {
                                        "/subsystem=resource-adapters/resource-adapter=*/connection-definitions=*" : {
                                            "address" : "/subsystem=resource-adapters/resource-adapter=*/connection-definitions=*",
                                            "attributes" : [
                                                "recovery-password",
                                                "recovery-username"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=datasources/xa-data-source=*" : {
                                            "address" : "/deployment=*/subsystem=datasources/xa-data-source=*",
                                            "attributes" : [
                                                "password",
                                                "recovery-password",
                                                "user-name",
                                                "recovery-username"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*/pooled-connection-factory=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*/pooled-connection-factory=*",
                                            "attributes" : [
                                                "password",
                                                "user"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/jms-bridge=*" : {
                                            "address" : "/subsystem=messaging/jms-bridge=*",
                                            "attributes" : [
                                                "target-user",
                                                "source-user",
                                                "source-password",
                                                "target-password"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=remoting/remote-outbound-connection=*" : {
                                            "address" : "/subsystem=remoting/remote-outbound-connection=*",
                                            "attributes" : ["username"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=mail/mail-session=*/custom=*" : {
                                            "address" : "/subsystem=mail/mail-session=*/custom=*",
                                            "attributes" : [
                                                "password",
                                                "username"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/deployment=*/subsystem=messaging/hornetq-server=*",
                                            "attributes" : [
                                                "cluster-user",
                                                "cluster-password"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*",
                                            "attributes" : [
                                                "cluster-user",
                                                "cluster-password"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=mail/mail-session=*/server=smtp" : {
                                            "address" : "/subsystem=mail/mail-session=*/server=smtp",
                                            "attributes" : [
                                                "password",
                                                "username"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=messaging/hornetq-server=*/pooled-connection-factory=*" : {
                                            "address" : "/deployment=*/subsystem=messaging/hornetq-server=*/pooled-connection-factory=*",
                                            "attributes" : [
                                                "password",
                                                "user"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=mail/mail-session=*/server=pop3" : {
                                            "address" : "/subsystem=mail/mail-session=*/server=pop3",
                                            "attributes" : [
                                                "password",
                                                "username"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=datasources/xa-data-source=*" : {
                                            "address" : "/subsystem=datasources/xa-data-source=*",
                                            "attributes" : [
                                                "password",
                                                "recovery-password",
                                                "user-name",
                                                "recovery-username"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/bridge=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/bridge=*",
                                            "attributes" : [
                                                "password",
                                                "user"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*",
                                            "attributes" : [
                                                "cluster-user",
                                                "cluster-password"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=datasources/data-source=*" : {
                                            "address" : "/subsystem=datasources/data-source=*",
                                            "attributes" : [
                                                "password",
                                                "user-name"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=mail/mail-session=*/server=imap" : {
                                            "address" : "/subsystem=mail/mail-session=*/server=imap",
                                            "attributes" : [
                                                "password",
                                                "username"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=datasources/xa-data-source=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=datasources/xa-data-source=*",
                                            "attributes" : [
                                                "password",
                                                "recovery-password",
                                                "user-name",
                                                "recovery-username"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=datasources/data-source=*" : {
                                            "address" : "/deployment=*/subsystem=datasources/data-source=*",
                                            "attributes" : [
                                                "password",
                                                "user-name"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=datasources/data-source=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=datasources/data-source=*",
                                            "attributes" : [
                                                "password",
                                                "user-name"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        }
                                    }
                                },
                                "domain-controller" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : null
                                },
                                "domain-names" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : null
                                },
                                "extensions" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : {"/extension=*" : {
                                        "address" : "/extension=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                },
                                "jvm" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : {"/core-service=platform-mbean/type=runtime" : {
                                        "address" : "/core-service=platform-mbean/type=runtime",
                                        "attributes" : [
                                            "library-path",
                                            "input-arguments",
                                            "class-path",
                                            "boot-class-path-supported",
                                            "boot-class-path"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    }}
                                },
                                "management-interfaces" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : {
                                        "/core-service=management/management-interface=native-interface" : {
                                            "address" : "/core-service=management/management-interface=native-interface",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/core-service=management/management-interface=http-interface" : {
                                            "address" : "/core-service=management/management-interface=http-interface",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/core-service=management/management-interface=native-remoting-interface" : {
                                            "address" : "/core-service=management/management-interface=native-remoting-interface",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        }
                                    }
                                },
                                "module-loading" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : {"/core-service=module-loading" : {
                                        "address" : "/core-service=module-loading",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                },
                                "patching" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : {
                                        "/core-service=patching/addon=*" : {
                                            "address" : "/core-service=patching/addon=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/core-service=patching/layer=*" : {
                                            "address" : "/core-service=patching/layer=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/core-service=patching" : {
                                            "address" : "/core-service=patching",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        }
                                    }
                                },
                                "read-whole-config" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : true,
                                    "default-requires-write" : true,
                                    "applies-to" : {
                                        "/subsystem=jmx" : {
                                            "address" : "/subsystem=jmx",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=datasources" : {
                                            "address" : "/subsystem=datasources",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/deployment=*/subsystem=datasources" : {
                                            "address" : "/deployment=*/subsystem=datasources",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=jpa" : {
                                            "address" : "/subsystem=jpa",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=io" : {
                                            "address" : "/subsystem=io",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=infinispan" : {
                                            "address" : "/subsystem=infinispan",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=logging" : {
                                            "address" : "/subsystem=logging",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=deployment-scanner" : {
                                            "address" : "/subsystem=deployment-scanner",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=weld" : {
                                            "address" : "/subsystem=weld",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=pojo" : {
                                            "address" : "/subsystem=pojo",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=transactions" : {
                                            "address" : "/subsystem=transactions",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=jca" : {
                                            "address" : "/subsystem=jca",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=naming" : {
                                            "address" : "/subsystem=naming",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=messaging" : {
                                            "address" : "/subsystem=messaging",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=jsf" : {
                                            "address" : "/subsystem=jsf",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=jaxrs" : {
                                            "address" : "/subsystem=jaxrs",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=jdr" : {
                                            "address" : "/subsystem=jdr",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=remoting" : {
                                            "address" : "/subsystem=remoting",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=resource-adapters" : {
                                            "address" : "/subsystem=resource-adapters",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=jsr77" : {
                                            "address" : "/subsystem=jsr77",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/" : {
                                            "address" : "/",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["read-config-as-xml"]
                                        },
                                        "/subsystem=jacorb" : {
                                            "address" : "/subsystem=jacorb",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=batch" : {
                                            "address" : "/subsystem=batch",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=ejb3" : {
                                            "address" : "/subsystem=ejb3",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=ee" : {
                                            "address" : "/subsystem=ee",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=security" : {
                                            "address" : "/subsystem=security",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=undertow" : {
                                            "address" : "/subsystem=undertow",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=webservices" : {
                                            "address" : "/subsystem=webservices",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=datasources" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=datasources",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=mail" : {
                                            "address" : "/subsystem=mail",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        },
                                        "/subsystem=sar" : {
                                            "address" : "/subsystem=sar",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["describe"]
                                        }
                                    }
                                },
                                "security-domain" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : true,
                                    "default-requires-read" : true,
                                    "default-requires-write" : true,
                                    "applies-to" : {"/subsystem=security/security-domain=*" : {
                                        "address" : "/subsystem=security/security-domain=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                },
                                "security-domain-ref" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : true,
                                    "default-requires-read" : true,
                                    "default-requires-write" : true,
                                    "applies-to" : {
                                        "/subsystem=resource-adapters/resource-adapter=*/connection-definitions=*" : {
                                            "address" : "/subsystem=resource-adapters/resource-adapter=*/connection-definitions=*",
                                            "attributes" : [
                                                "security-domain",
                                                "security-domain-and-application",
                                                "security-application",
                                                "recovery-security-domain"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=datasources/xa-data-source=*" : {
                                            "address" : "/deployment=*/subsystem=datasources/xa-data-source=*",
                                            "attributes" : ["security-domain"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=ejb3" : {
                                            "address" : "/subsystem=ejb3",
                                            "attributes" : ["default-security-domain"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/deployment=*/subsystem=messaging/hornetq-server=*",
                                            "attributes" : ["security-domain"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*",
                                            "attributes" : ["security-domain"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*",
                                            "attributes" : ["security-domain"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=datasources/data-source=*" : {
                                            "address" : "/subsystem=datasources/data-source=*",
                                            "attributes" : ["security-domain"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=datasources/xa-data-source=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=datasources/xa-data-source=*",
                                            "attributes" : ["security-domain"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=datasources/data-source=*" : {
                                            "address" : "/deployment=*/subsystem=datasources/data-source=*",
                                            "attributes" : ["security-domain"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=datasources/xa-data-source=*" : {
                                            "address" : "/subsystem=datasources/xa-data-source=*",
                                            "attributes" : ["security-domain"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=datasources/data-source=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=datasources/data-source=*",
                                            "attributes" : ["security-domain"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        }
                                    }
                                },
                                "security-realm" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : true,
                                    "default-requires-read" : true,
                                    "default-requires-write" : true,
                                    "applies-to" : {"/core-service=management/security-realm=*" : {
                                        "address" : "/core-service=management/security-realm=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                },
                                "security-realm-ref" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : true,
                                    "default-requires-read" : true,
                                    "default-requires-write" : true,
                                    "applies-to" : {
                                        "/subsystem=remoting/connector=*" : {
                                            "address" : "/subsystem=remoting/connector=*",
                                            "attributes" : ["security-realm"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/core-service=management/management-interface=native-interface" : {
                                            "address" : "/core-service=management/management-interface=native-interface",
                                            "attributes" : ["security-realm"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=remoting/remote-outbound-connection=*" : {
                                            "address" : "/subsystem=remoting/remote-outbound-connection=*",
                                            "attributes" : ["security-realm"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/core-service=management/management-interface=http-interface" : {
                                            "address" : "/core-service=management/management-interface=http-interface",
                                            "attributes" : ["security-realm"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=remoting/http-connector=*" : {
                                            "address" : "/subsystem=remoting/http-connector=*",
                                            "attributes" : ["security-realm"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        }
                                    }
                                },
                                "security-vault" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : true,
                                    "default-requires-write" : true,
                                    "applies-to" : {"/core-service=vault" : {
                                        "address" : "/core-service=vault",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                },
                                "service-container" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : {"/core-service=service-container" : {
                                        "address" : "/core-service=service-container",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                },
                                "snapshots" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : false,
                                    "applies-to" : {"/" : {
                                        "address" : "/",
                                        "attributes" : [],
                                        "entire-resource" : false,
                                        "operations" : [
                                            "list-snapshots",
                                            "delete-snapshot",
                                            "take-snapshot"
                                        ]
                                    }}
                                },
                                "socket-binding-ref" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : false,
                                    "applies-to" : {
                                        "/subsystem=remoting/connector=*" : {
                                            "address" : "/subsystem=remoting/connector=*",
                                            "attributes" : ["socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/remote-connector=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/remote-connector=*",
                                            "attributes" : ["socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/acceptor=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/acceptor=*",
                                            "attributes" : ["socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=remoting/remote-outbound-connection=*" : {
                                            "address" : "/subsystem=remoting/remote-outbound-connection=*",
                                            "attributes" : ["outbound-socket-binding-ref"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=mail/mail-session=*/custom=*" : {
                                            "address" : "/subsystem=mail/mail-session=*/custom=*",
                                            "attributes" : ["outbound-socket-binding-ref"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/remote-acceptor=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/remote-acceptor=*",
                                            "attributes" : ["socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/server=*/http-listener=*" : {
                                            "address" : "/subsystem=undertow/server=*/http-listener=*",
                                            "attributes" : ["socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=mail/mail-session=*/server=smtp" : {
                                            "address" : "/subsystem=mail/mail-session=*/server=smtp",
                                            "attributes" : ["outbound-socket-binding-ref"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=mail/mail-session=*/server=pop3" : {
                                            "address" : "/subsystem=mail/mail-session=*/server=pop3",
                                            "attributes" : ["outbound-socket-binding-ref"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/server=*/https-listener=*" : {
                                            "address" : "/subsystem=undertow/server=*/https-listener=*",
                                            "attributes" : ["socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/broadcast-group=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/broadcast-group=*",
                                            "attributes" : ["socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/configuration=handler/reverse-proxy=*/host=*" : {
                                            "address" : "/subsystem=undertow/configuration=handler/reverse-proxy=*/host=*",
                                            "attributes" : ["outbound-socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=jacorb" : {
                                            "address" : "/subsystem=jacorb",
                                            "attributes" : [
                                                "security-domain",
                                                "socket-binding",
                                                "ssl-socket-binding"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/discovery-group=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/discovery-group=*",
                                            "attributes" : ["socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/connector=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/connector=*",
                                            "attributes" : ["socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=transactions" : {
                                            "address" : "/subsystem=transactions",
                                            "attributes" : [
                                                "socket-binding",
                                                "process-id-socket-binding",
                                                "status-socket-binding"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/http-connector=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/http-connector=*",
                                            "attributes" : ["socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/socket-binding-group=*/local-destination-outbound-socket-binding=*" : {
                                            "address" : "/socket-binding-group=*/local-destination-outbound-socket-binding=*",
                                            "attributes" : ["socket-binding-ref"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=mail/mail-session=*/server=imap" : {
                                            "address" : "/subsystem=mail/mail-session=*/server=imap",
                                            "attributes" : ["outbound-socket-binding-ref"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/server=*/ajp-listener=*" : {
                                            "address" : "/subsystem=undertow/server=*/ajp-listener=*",
                                            "attributes" : ["socket-binding"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=remoting/local-outbound-connection=*" : {
                                            "address" : "/subsystem=remoting/local-outbound-connection=*",
                                            "attributes" : ["outbound-socket-binding-ref"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        }
                                    }
                                },
                                "socket-config" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : {
                                        "/core-service=management/management-interface=native-interface" : {
                                            "address" : "/core-service=management/management-interface=native-interface",
                                            "attributes" : [
                                                "socket-binding",
                                                "port",
                                                "interface"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=transactions" : {
                                            "address" : "/subsystem=transactions",
                                            "attributes" : ["process-id-socket-max-ports"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/core-service=management/management-interface=http-interface" : {
                                            "address" : "/core-service=management/management-interface=http-interface",
                                            "attributes" : [
                                                "secure-port",
                                                "socket-binding",
                                                "port",
                                                "secure-socket-binding",
                                                "interface"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/interface=*" : {
                                            "address" : "/interface=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : ["resolve-internet-address"]
                                        },
                                        "/subsystem=messaging/hornetq-server=*/broadcast-group=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/broadcast-group=*",
                                            "attributes" : [
                                                "group-port",
                                                "local-bind-port",
                                                "local-bind-address",
                                                "group-address"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/" : {
                                            "address" : "/",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["resolve-internet-address"]
                                        },
                                        "/socket-binding-group=*" : {
                                            "address" : "/socket-binding-group=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/discovery-group=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/discovery-group=*",
                                            "attributes" : [
                                                "group-port",
                                                "local-bind-address",
                                                "group-address"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        }
                                    }
                                },
                                "system-property" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : {
                                        "/core-service=platform-mbean/type=runtime" : {
                                            "address" : "/core-service=platform-mbean/type=runtime",
                                            "attributes" : ["system-properties"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/system-property=*" : {
                                            "address" : "/system-property=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/" : {
                                            "address" : "/",
                                            "attributes" : [],
                                            "entire-resource" : false,
                                            "operations" : ["resolve-expression"]
                                        }
                                    }
                                }
                            }},
                            "datasources" : {"classification" : {"data-source-security" : {
                                "configured-requires-addressable" : null,
                                "configured-requires-read" : null,
                                "configured-requires-write" : null,
                                "default-requires-addressable" : false,
                                "default-requires-read" : true,
                                "default-requires-write" : true,
                                "applies-to" : {
                                    "/deployment=*/subsystem=datasources/xa-data-source=*" : {
                                        "address" : "/deployment=*/subsystem=datasources/xa-data-source=*",
                                        "attributes" : [
                                            "security-domain",
                                            "password",
                                            "user-name"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    },
                                    "/subsystem=datasources/data-source=*" : {
                                        "address" : "/subsystem=datasources/data-source=*",
                                        "attributes" : [
                                            "security-domain",
                                            "password",
                                            "user-name"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    },
                                    "/deployment=*/subdeployment=*/subsystem=datasources/xa-data-source=*" : {
                                        "address" : "/deployment=*/subdeployment=*/subsystem=datasources/xa-data-source=*",
                                        "attributes" : [
                                            "security-domain",
                                            "password",
                                            "user-name"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    },
                                    "/deployment=*/subsystem=datasources/data-source=*" : {
                                        "address" : "/deployment=*/subsystem=datasources/data-source=*",
                                        "attributes" : [
                                            "security-domain",
                                            "password",
                                            "user-name"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    },
                                    "/subsystem=datasources/xa-data-source=*" : {
                                        "address" : "/subsystem=datasources/xa-data-source=*",
                                        "attributes" : [
                                            "security-domain",
                                            "password",
                                            "user-name"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    },
                                    "/deployment=*/subdeployment=*/subsystem=datasources/data-source=*" : {
                                        "address" : "/deployment=*/subdeployment=*/subsystem=datasources/data-source=*",
                                        "attributes" : [
                                            "security-domain",
                                            "password",
                                            "user-name"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    }
                                }
                            }}},
                            "jacorb" : {"classification" : {"jacorb-security" : {
                                "configured-requires-addressable" : null,
                                "configured-requires-read" : null,
                                "configured-requires-write" : null,
                                "default-requires-addressable" : false,
                                "default-requires-read" : false,
                                "default-requires-write" : true,
                                "applies-to" : {"/subsystem=jacorb" : {
                                    "address" : "/subsystem=jacorb",
                                    "attributes" : [
                                        "security-domain",
                                        "security",
                                        "client-requires",
                                        "add-component-via-interceptor",
                                        "client-supports",
                                        "support-ssl",
                                        "server-requires",
                                        "server-supports"
                                    ],
                                    "entire-resource" : false,
                                    "operations" : []
                                }}
                            }}},
                            "jdr" : {"classification" : {"jdr" : {
                                "configured-requires-addressable" : null,
                                "configured-requires-read" : null,
                                "configured-requires-write" : null,
                                "default-requires-addressable" : false,
                                "default-requires-read" : false,
                                "default-requires-write" : true,
                                "applies-to" : {"/subsystem=jdr" : {
                                    "address" : "/subsystem=jdr",
                                    "attributes" : [],
                                    "entire-resource" : false,
                                    "operations" : ["generate-jdr-report"]
                                }}
                            }}},
                            "jmx" : {"classification" : {"jmx" : {
                                "configured-requires-addressable" : null,
                                "configured-requires-read" : null,
                                "configured-requires-write" : null,
                                "default-requires-addressable" : false,
                                "default-requires-read" : false,
                                "default-requires-write" : true,
                                "applies-to" : {"/subsystem=jmx" : {
                                    "address" : "/subsystem=jmx",
                                    "attributes" : [],
                                    "entire-resource" : true,
                                    "operations" : []
                                }}
                            }}},
                            "logging" : {"classification" : {"view-server-logs" : {
                                "configured-requires-addressable" : null,
                                "configured-requires-read" : null,
                                "configured-requires-write" : null,
                                "default-requires-addressable" : false,
                                "default-requires-read" : false,
                                "default-requires-write" : false,
                                "applies-to" : {
                                    "/subsystem=logging/logging-profile=*/log-file=*" : {
                                        "address" : "/subsystem=logging/logging-profile=*/log-file=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : ["read-log-file"]
                                    },
                                    "/subsystem=logging" : {
                                        "address" : "/subsystem=logging",
                                        "attributes" : [],
                                        "entire-resource" : false,
                                        "operations" : [
                                            "read-log-file",
                                            "list-log-files"
                                        ]
                                    },
                                    "/subsystem=logging/log-file=*" : {
                                        "address" : "/subsystem=logging/log-file=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : ["read-log-file"]
                                    }
                                }
                            }}},
                            "mail" : {"classification" : {"mail-server-security" : {
                                "configured-requires-addressable" : null,
                                "configured-requires-read" : null,
                                "configured-requires-write" : null,
                                "default-requires-addressable" : false,
                                "default-requires-read" : false,
                                "default-requires-write" : true,
                                "applies-to" : {
                                    "/subsystem=mail/mail-session=*/custom=*" : {
                                        "address" : "/subsystem=mail/mail-session=*/custom=*",
                                        "attributes" : [
                                            "password",
                                            "tls",
                                            "ssl",
                                            "username"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    },
                                    "/subsystem=mail/mail-session=*/server=smtp" : {
                                        "address" : "/subsystem=mail/mail-session=*/server=smtp",
                                        "attributes" : [
                                            "password",
                                            "tls",
                                            "ssl",
                                            "username"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    },
                                    "/subsystem=mail/mail-session=*/server=imap" : {
                                        "address" : "/subsystem=mail/mail-session=*/server=imap",
                                        "attributes" : [
                                            "password",
                                            "tls",
                                            "ssl",
                                            "username"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    },
                                    "/subsystem=mail/mail-session=*/server=pop3" : {
                                        "address" : "/subsystem=mail/mail-session=*/server=pop3",
                                        "attributes" : [
                                            "password",
                                            "tls",
                                            "ssl",
                                            "username"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    }
                                }
                            }}},
                            "messaging" : {"classification" : {
                                "messaging-management" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : {
                                        "/subsystem=messaging/hornetq-server=*/security-setting=*/role=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/security-setting=*/role=*",
                                            "attributes" : ["manage"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/deployment=*/subsystem=messaging/hornetq-server=*",
                                            "attributes" : [
                                                "management-notification-address",
                                                "jmx-management-enabled",
                                                "jmx-domain",
                                                "management-address"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/core-address=*/role=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/core-address=*/role=*",
                                            "attributes" : ["manage"],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*",
                                            "attributes" : [
                                                "management-notification-address",
                                                "jmx-management-enabled",
                                                "jmx-domain",
                                                "management-address"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*",
                                            "attributes" : [
                                                "management-notification-address",
                                                "jmx-management-enabled",
                                                "jmx-domain",
                                                "management-address"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        }
                                    }
                                },
                                "messaging-security" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : true,
                                    "applies-to" : {
                                        "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*/pooled-connection-factory=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*/pooled-connection-factory=*",
                                            "attributes" : [
                                                "password",
                                                "user"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/jms-bridge=*" : {
                                            "address" : "/subsystem=messaging/jms-bridge=*",
                                            "attributes" : [
                                                "target-user",
                                                "source-user",
                                                "source-password",
                                                "target-password"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/deployment=*/subsystem=messaging/hornetq-server=*",
                                            "attributes" : [
                                                "security-domain",
                                                "security-invalidation-interval",
                                                "cluster-user",
                                                "security-enabled",
                                                "cluster-password"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/bridge=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/bridge=*",
                                            "attributes" : [
                                                "password",
                                                "user"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*",
                                            "attributes" : [
                                                "security-domain",
                                                "security-invalidation-interval",
                                                "cluster-user",
                                                "security-enabled",
                                                "cluster-password"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*" : {
                                            "address" : "/deployment=*/subdeployment=*/subsystem=messaging/hornetq-server=*",
                                            "attributes" : [
                                                "security-domain",
                                                "security-invalidation-interval",
                                                "cluster-user",
                                                "security-enabled",
                                                "cluster-password"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        },
                                        "/subsystem=messaging/hornetq-server=*/security-setting=*" : {
                                            "address" : "/subsystem=messaging/hornetq-server=*/security-setting=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/deployment=*/subsystem=messaging/hornetq-server=*/pooled-connection-factory=*" : {
                                            "address" : "/deployment=*/subsystem=messaging/hornetq-server=*/pooled-connection-factory=*",
                                            "attributes" : [
                                                "password",
                                                "user"
                                            ],
                                            "entire-resource" : false,
                                            "operations" : []
                                        }
                                    }
                                }
                            }},
                            "naming" : {"classification" : {
                                "jndi-view" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : true,
                                    "default-requires-write" : true,
                                    "applies-to" : {"/subsystem=naming" : {
                                        "address" : "/subsystem=naming",
                                        "attributes" : [],
                                        "entire-resource" : false,
                                        "operations" : ["jndi-view"]
                                    }}
                                },
                                "naming-binding" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : false,
                                    "applies-to" : {"/subsystem=naming/binding=*" : {
                                        "address" : "/subsystem=naming/binding=*",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                }
                            }},
                            "remoting" : {"classification" : {"remoting-security" : {
                                "configured-requires-addressable" : null,
                                "configured-requires-read" : null,
                                "configured-requires-write" : null,
                                "default-requires-addressable" : false,
                                "default-requires-read" : true,
                                "default-requires-write" : true,
                                "applies-to" : {
                                    "/subsystem=remoting/connector=*" : {
                                        "address" : "/subsystem=remoting/connector=*",
                                        "attributes" : [
                                            "authentication-provider",
                                            "security-realm"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    },
                                    "/subsystem=remoting/remote-outbound-connection=*" : {
                                        "address" : "/subsystem=remoting/remote-outbound-connection=*",
                                        "attributes" : [
                                            "security-realm",
                                            "username"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    },
                                    "/subsystem=remoting/http-connector=*/security=sasl" : {
                                        "address" : "/subsystem=remoting/http-connector=*/security=sasl",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    },
                                    "/subsystem=remoting/connector=*/security=sasl" : {
                                        "address" : "/subsystem=remoting/connector=*/security=sasl",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    },
                                    "/subsystem=remoting/http-connector=*" : {
                                        "address" : "/subsystem=remoting/http-connector=*",
                                        "attributes" : [
                                            "authentication-provider",
                                            "security-realm"
                                        ],
                                        "entire-resource" : false,
                                        "operations" : []
                                    }
                                }
                            }}},
                            "resource-adapters" : {"classification" : {"resource-adapter-security" : {
                                "configured-requires-addressable" : null,
                                "configured-requires-read" : null,
                                "configured-requires-write" : null,
                                "default-requires-addressable" : false,
                                "default-requires-read" : true,
                                "default-requires-write" : true,
                                "applies-to" : {"/subsystem=resource-adapters/resource-adapter=*/connection-definitions=*" : {
                                    "address" : "/subsystem=resource-adapters/resource-adapter=*/connection-definitions=*",
                                    "attributes" : [
                                        "security-domain",
                                        "security-domain-and-application",
                                        "recovery-password",
                                        "security-application",
                                        "recovery-security-domain",
                                        "recovery-username"
                                    ],
                                    "entire-resource" : false,
                                    "operations" : []
                                }}
                            }}},
                            "security" : {"classification" : {"misc-security" : {
                                "configured-requires-addressable" : null,
                                "configured-requires-read" : null,
                                "configured-requires-write" : null,
                                "default-requires-addressable" : false,
                                "default-requires-read" : true,
                                "default-requires-write" : true,
                                "applies-to" : {"/subsystem=security" : {
                                    "address" : "/subsystem=security",
                                    "attributes" : ["deep-copy-subject-mode"],
                                    "entire-resource" : false,
                                    "operations" : []
                                }}
                            }}},
                            "undertow" : {"classification" : {
                                "undertow-filter" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : false,
                                    "applies-to" : {
                                        "/subsystem=undertow/configuration=filter/error-page=*" : {
                                            "address" : "/subsystem=undertow/configuration=filter/error-page=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/configuration=filter/basic-auth=*" : {
                                            "address" : "/subsystem=undertow/configuration=filter/basic-auth=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/configuration=filter/response-header=*" : {
                                            "address" : "/subsystem=undertow/configuration=filter/response-header=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/configuration=filter/connection-limit=*" : {
                                            "address" : "/subsystem=undertow/configuration=filter/connection-limit=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/configuration=filter/gzip=*" : {
                                            "address" : "/subsystem=undertow/configuration=filter/gzip=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/configuration=filter/custom-filter=*" : {
                                            "address" : "/subsystem=undertow/configuration=filter/custom-filter=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        }
                                    }
                                },
                                "undertow-handler" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : false,
                                    "applies-to" : {
                                        "/subsystem=undertow/configuration=handler/file=*" : {
                                            "address" : "/subsystem=undertow/configuration=handler/file=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/configuration=handler/reverse-proxy=*" : {
                                            "address" : "/subsystem=undertow/configuration=handler/reverse-proxy=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        }
                                    }
                                },
                                "web-access-log" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : false,
                                    "applies-to" : {"/subsystem=undertow/server=*/host=*/setting=access-log" : {
                                        "address" : "/subsystem=undertow/server=*/host=*/setting=access-log",
                                        "attributes" : [],
                                        "entire-resource" : true,
                                        "operations" : []
                                    }}
                                },
                                "web-connector" : {
                                    "configured-requires-addressable" : null,
                                    "configured-requires-read" : null,
                                    "configured-requires-write" : null,
                                    "default-requires-addressable" : false,
                                    "default-requires-read" : false,
                                    "default-requires-write" : false,
                                    "applies-to" : {
                                        "/subsystem=undertow/server=*/http-listener=*" : {
                                            "address" : "/subsystem=undertow/server=*/http-listener=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/server=*/https-listener=*" : {
                                            "address" : "/subsystem=undertow/server=*/https-listener=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        },
                                        "/subsystem=undertow/server=*/ajp-listener=*" : {
                                            "address" : "/subsystem=undertow/server=*/ajp-listener=*",
                                            "attributes" : [],
                                            "entire-resource" : true,
                                            "operations" : []
                                        }
                                    }
                                }
                            }}
                        }},
                        "vault-expression" : {
                            "configured-requires-read" : null,
                            "configured-requires-write" : null,
                            "default-requires-read" : true,
                            "default-requires-write" : true
                        }
                    },
                    "role-mapping" : {"SuperUser" : {
                        "include-all" : false,
                        "exclude" : null,
                        "include" : {"user-$local" : {
                            "name" : "$local",
                            "realm" : null,
                            "type" : "USER"
                        }}
                    }}
                },
                "audit" : {
                    "file-handler" : {"file" : {
                        "disabled-due-to-failure" : false,
                        "failure-count" : 0,
                        "formatter" : "json-formatter",
                        "max-failure-count" : 10,
                        "path" : "audit-log.log",
                        "relative-to" : "jboss.server.data.dir"
                    }},
                    "json-formatter" : {"json-formatter" : {
                        "compact" : false,
                        "date-format" : "yyyy-MM-dd HH:mm:ss",
                        "date-separator" : " - ",
                        "escape-control-characters" : false,
                        "escape-new-line" : false,
                        "include-date" : true
                    }},
                    "logger" : {"audit-log" : {
                        "enabled" : false,
                        "log-boot" : true,
                        "log-read-only" : false,
                        "handler" : {"file" : {}}
                    }},
                    "syslog-handler" : null
                }
            },
            "ldap-connection" : null,
            "management-interface" : {"http-interface" : {
                "console-enabled" : true,
                "http-upgrade-enabled" : true,
                "interface" : null,
                "port" : null,
                "secure-port" : null,
                "secure-socket-binding" : null,
                "security-realm" : "ManagementRealm",
                "socket-binding" : "management-http"
            }},
            "security-realm" : {
                "UndertowRealm" : {
                    "map-groups-to-roles" : true,
                    "authentication" : null,
                    "authorization" : null,
                    "plug-in" : null,
                    "server-identity" : {"ssl" : {
                        "alias" : "mycert",
                        "enabled-cipher-suites" : null,
                        "enabled-protocols" : [
                            "TLSv1",
                            "TLSv1.1",
                            "TLSv1.2"
                        ],
                        "key-password" : "secret",
                        "keystore-password" : "secret",
                        "keystore-path" : "myHttps.keystore",
                        "keystore-provider" : "JKS",
                        "keystore-relative-to" : "jboss.server.config.dir",
                        "protocol" : "TLS"
                    }}
                },
                "ManagementRealm" : {
                    "map-groups-to-roles" : false,
                    "authentication" : {
                        "local" : {
                            "allowed-users" : null,
                            "default-user" : "$local",
                            "skip-group-loading" : true
                        },
                        "properties" : {
                            "path" : "mgmt-users.properties",
                            "plain-text" : false,
                            "relative-to" : "jboss.server.config.dir"
                        }
                    },
                    "authorization" : {"properties" : {
                        "path" : "mgmt-groups.properties",
                        "relative-to" : "jboss.server.config.dir"
                    }},
                    "plug-in" : null,
                    "server-identity" : null
                },
                "ApplicationRealm" : {
                    "map-groups-to-roles" : true,
                    "authentication" : {
                        "local" : {
                            "allowed-users" : "*",
                            "default-user" : "$local",
                            "skip-group-loading" : true
                        },
                        "properties" : {
                            "path" : "application-users.properties",
                            "plain-text" : false,
                            "relative-to" : "jboss.server.config.dir"
                        }
                    },
                    "authorization" : {"properties" : {
                        "path" : "application-roles.properties",
                        "relative-to" : "jboss.server.config.dir"
                    }},
                    "plug-in" : null,
                    "server-identity" : null
                }
            }
        },
        "service-container" : {},
        "module-loading" : {"module-roots" : [
            "D:\\michael\\java\\wildfly-8.2.0.Final\\modules",
            "D:\\michael\\java\\wildfly-8.2.0.Final\\modules\\system\\layers\\base"
        ]},
        "server-environment" : {
            "base-dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone",
            "config-dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\configuration",
            "config-file" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\configuration\\standalone-full.xml",
            "content-dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\data\\content",
            "data-dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\data",
            "deploy-dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\data\\content",
            "ext-dirs" : [
                "C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\ext",
                "C:\\Windows\\Sun\\Java\\lib\\ext"
            ],
            "home-dir" : "D:\\michael\\java\\wildfly-8.2.0.Final",
            "host-name" : "delllat6410",
            "initial-running-mode" : "NORMAL",
            "launch-type" : "STANDALONE",
            "log-dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\log",
            "modules-dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\modules",
            "node-name" : "delllat6410",
            "qualified-host-name" : "delllat6410",
            "server-name" : "delllat6410",
            "temp-dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\tmp"
        },
        "platform-mbean" : {"type" : {
            "class-loading" : {
                "loaded-class-count" : 20086,
                "object-name" : "java.lang:type=ClassLoading",
                "total-loaded-class-count" : 20139,
                "unloaded-class-count" : 53,
                "verbose" : false
            },
            "memory" : {
                "heap-memory-usage" : {
                    "init" : 134217728,
                    "used" : 480974080,
                    "committed" : 515899392,
                    "max" : 515899392
                },
                "non-heap-memory-usage" : {
                    "init" : 2555904,
                    "used" : 170908080,
                    "committed" : 185466880,
                    "max" : -1
                },
                "object-name" : "java.lang:type=Memory",
                "object-pending-finalization-count" : 0,
                "verbose" : false
            },
            "compilation" : {
                "name" : "HotSpot 64-Bit Tiered Compilers",
                "compilation-time-monitoring-supported" : true,
                "total-compilation-time" : 115295,
                "object-name" : "java.lang:type=Compilation"
            },
            "garbage-collector" : {"name" : {
                "PS_Scavenge" : {
                    "collection-count" : 247,
                    "collection-time" : 9462,
                    "memory-pool-names" : [
                        "PS_Eden_Space",
                        "PS_Survivor_Space"
                    ],
                    "name" : "PS_Scavenge",
                    "object-name" : "java.lang:type=GarbageCollector,name=\"PS Scavenge\"",
                    "valid" : true
                },
                "PS_MarkSweep" : {
                    "collection-count" : 7,
                    "collection-time" : 5762,
                    "memory-pool-names" : [
                        "PS_Eden_Space",
                        "PS_Survivor_Space",
                        "PS_Old_Gen"
                    ],
                    "name" : "PS_MarkSweep",
                    "object-name" : "java.lang:type=GarbageCollector,name=\"PS MarkSweep\"",
                    "valid" : true
                }
            }},
            "memory-pool" : {"name" : {
                "PS_Old_Gen" : {
                    "name" : "PS_Old_Gen",
                    "type" : "HEAP",
                    "valid" : true,
                    "memory-manager-names" : ["PS_MarkSweep"],
                    "usage-threshold-supported" : true,
                    "collection-usage-threshold-supported" : true,
                    "usage-threshold" : 0,
                    "collection-usage-threshold" : 0,
                    "usage" : {
                        "init" : 89653248,
                        "used" : 347297656,
                        "committed" : 358088704,
                        "max" : 358088704
                    },
                    "peak-usage" : {
                        "init" : 89653248,
                        "used" : 351134512,
                        "committed" : 358088704,
                        "max" : 358088704
                    },
                    "usage-threshold-exceeded" : false,
                    "usage-threshold-count" : 0,
                    "collection-usage-threshold-exceeded" : false,
                    "collection-usage-threshold-count" : 0,
                    "collection-usage" : {
                        "init" : 89653248,
                        "used" : 329193336,
                        "committed" : 358088704,
                        "max" : 358088704
                    },
                    "object-name" : "java.lang:type=MemoryPool,name=\"PS Old Gen\""
                },
                "Code_Cache" : {
                    "name" : "Code_Cache",
                    "type" : "NON_HEAP",
                    "valid" : true,
                    "memory-manager-names" : ["CodeCacheManager"],
                    "usage-threshold-supported" : true,
                    "collection-usage-threshold-supported" : false,
                    "usage-threshold" : 0,
                    "collection-usage-threshold" : null,
                    "usage" : {
                        "init" : 2555904,
                        "used" : 46054144,
                        "committed" : 47579136,
                        "max" : 251658240
                    },
                    "peak-usage" : {
                        "init" : 2555904,
                        "used" : 47238400,
                        "committed" : 47579136,
                        "max" : 251658240
                    },
                    "usage-threshold-exceeded" : false,
                    "usage-threshold-count" : 0,
                    "collection-usage-threshold-exceeded" : null,
                    "collection-usage-threshold-count" : null,
                    "collection-usage" : null,
                    "object-name" : "java.lang:type=MemoryPool,name=\"Code Cache\""
                },
                "PS_Survivor_Space" : {
                    "name" : "PS_Survivor_Space",
                    "type" : "HEAP",
                    "valid" : true,
                    "memory-manager-names" : [
                        "PS_MarkSweep",
                        "PS_Scavenge"
                    ],
                    "usage-threshold-supported" : false,
                    "collection-usage-threshold-supported" : true,
                    "usage-threshold" : null,
                    "collection-usage-threshold" : 0,
                    "usage" : {
                        "init" : 5242880,
                        "used" : 13860864,
                        "committed" : 19398656,
                        "max" : 19398656
                    },
                    "peak-usage" : {
                        "init" : 5242880,
                        "used" : 29412400,
                        "committed" : 37224448,
                        "max" : 37224448
                    },
                    "usage-threshold-exceeded" : null,
                    "usage-threshold-count" : null,
                    "collection-usage-threshold-exceeded" : false,
                    "collection-usage-threshold-count" : 0,
                    "collection-usage" : {
                        "init" : 5242880,
                        "used" : 13860864,
                        "committed" : 19398656,
                        "max" : 19398656
                    },
                    "object-name" : "java.lang:type=MemoryPool,name=\"PS Survivor Space\""
                },
                "Metaspace" : {
                    "name" : "Metaspace",
                    "type" : "NON_HEAP",
                    "valid" : true,
                    "memory-manager-names" : ["Metaspace_Manager"],
                    "usage-threshold-supported" : true,
                    "collection-usage-threshold-supported" : false,
                    "usage-threshold" : 0,
                    "collection-usage-threshold" : null,
                    "usage" : {
                        "init" : 0,
                        "used" : 110976704,
                        "committed" : 120979456,
                        "max" : -1
                    },
                    "peak-usage" : {
                        "init" : 0,
                        "used" : 111126856,
                        "committed" : 120979456,
                        "max" : -1
                    },
                    "usage-threshold-exceeded" : false,
                    "usage-threshold-count" : 0,
                    "collection-usage-threshold-exceeded" : null,
                    "collection-usage-threshold-count" : null,
                    "collection-usage" : null,
                    "object-name" : "java.lang:type=MemoryPool,name=Metaspace"
                },
                "PS_Eden_Space" : {
                    "name" : "PS_Eden_Space",
                    "type" : "HEAP",
                    "valid" : true,
                    "memory-manager-names" : [
                        "PS_MarkSweep",
                        "PS_Scavenge"
                    ],
                    "usage-threshold-supported" : false,
                    "collection-usage-threshold-supported" : true,
                    "usage-threshold" : null,
                    "collection-usage-threshold" : 0,
                    "usage" : {
                        "init" : 34078720,
                        "used" : 118933344,
                        "committed" : 138412032,
                        "max" : 139984896
                    },
                    "peak-usage" : {
                        "init" : 34078720,
                        "used" : 148373504,
                        "committed" : 148373504,
                        "max" : 168296448
                    },
                    "usage-threshold-exceeded" : null,
                    "usage-threshold-count" : null,
                    "collection-usage-threshold-exceeded" : false,
                    "collection-usage-threshold-count" : 0,
                    "collection-usage" : {
                        "init" : 34078720,
                        "used" : 0,
                        "committed" : 138412032,
                        "max" : 139984896
                    },
                    "object-name" : "java.lang:type=MemoryPool,name=\"PS Eden Space\""
                },
                "Compressed_Class_Space" : {
                    "name" : "Compressed_Class_Space",
                    "type" : "NON_HEAP",
                    "valid" : true,
                    "memory-manager-names" : ["Metaspace_Manager"],
                    "usage-threshold-supported" : true,
                    "collection-usage-threshold-supported" : false,
                    "usage-threshold" : 0,
                    "collection-usage-threshold" : null,
                    "usage" : {
                        "init" : 0,
                        "used" : 13871520,
                        "committed" : 16908288,
                        "max" : 1073741824
                    },
                    "peak-usage" : {
                        "init" : 0,
                        "used" : 13897576,
                        "committed" : 16908288,
                        "max" : 1073741824
                    },
                    "usage-threshold-exceeded" : false,
                    "usage-threshold-count" : 0,
                    "collection-usage-threshold-exceeded" : null,
                    "collection-usage-threshold-count" : null,
                    "collection-usage" : null,
                    "object-name" : "java.lang:type=MemoryPool,name=\"Compressed Class Space\""
                }
            }},
            "operating-system" : {
                "name" : "Windows 7",
                "arch" : "amd64",
                "version" : "6.1",
                "available-processors" : 4,
                "system-load-average" : -1.0,
                "object-name" : "java.lang:type=OperatingSystem"
            },
            "memory-manager" : {"name" : {
                "Metaspace_Manager" : {
                    "memory-pool-names" : [
                        "Metaspace",
                        "Compressed_Class_Space"
                    ],
                    "name" : "Metaspace_Manager",
                    "object-name" : "java.lang:type=MemoryManager,name=\"Metaspace Manager\"",
                    "valid" : true
                },
                "PS_Scavenge" : {
                    "memory-pool-names" : [
                        "PS_Eden_Space",
                        "PS_Survivor_Space"
                    ],
                    "name" : "PS_Scavenge",
                    "object-name" : "java.lang:type=MemoryManager,name=\"PS Scavenge\"",
                    "valid" : true
                },
                "PS_MarkSweep" : {
                    "memory-pool-names" : [
                        "PS_Eden_Space",
                        "PS_Survivor_Space",
                        "PS_Old_Gen"
                    ],
                    "name" : "PS_MarkSweep",
                    "object-name" : "java.lang:type=MemoryManager,name=\"PS MarkSweep\"",
                    "valid" : true
                },
                "CodeCacheManager" : {
                    "memory-pool-names" : ["Code_Cache"],
                    "name" : "CodeCacheManager",
                    "object-name" : "java.lang:type=MemoryManager,name=CodeCacheManager",
                    "valid" : true
                }
            }},
            "runtime" : {
                "name" : "8756@DellLat6410",
                "vm-name" : "Java HotSpot(TM) 64-Bit Server VM",
                "vm-vendor" : "Oracle Corporation",
                "vm-version" : "25.45-b02",
                "spec-name" : "Java Virtual Machine Specification",
                "spec-vendor" : "Oracle Corporation",
                "spec-version" : "1.8",
                "management-spec-version" : "1.2",
                "class-path" : "D:\\michael\\java\\wildfly-8.2.0.Final\\jboss-modules.jar",
                "library-path" : "C:\\Program Files\\Java\\jdk1.8.0_45\\bin;C:\\Windows\\Sun\\Java\\bin;C:\\Windows\\system32;C:\\Windows;C:\\ProgramData\\Oracle\\Java\\javapath;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Program Files\\WIDCOMM\\Bluetooth Software\\;C:\\Program Files\\WIDCOMM\\Bluetooth Software\\syswow64;C:\\Program Files\\Intel\\WiFi\\bin\\;C:\\Program Files\\Common Files\\Intel\\WirelessCommon\\;C:\\Program Files\\TortoiseSVN\\bin;C:\\Program Files (x86)\\Common Files\\Roxio Shared\\DLLShared\\;C:\\Program Files (x86)\\Common Files\\Roxio Shared\\10.0\\DLLShared\\;C:\\Program Files\\TortoiseGit\\bin;D:\\Program Files\\Git\\cmd;D:\\Program Files\\Git\\bin;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Program Files\\WIDCOMM\\Bluetooth Software\\;C:\\Program Files\\WIDCOMM\\Bluetooth Software\\syswow64;C:\\Program Files\\Intel\\WiFi\\bin\\;C:\\Program Files\\Common Files\\Intel\\WirelessCommon\\;C:\\Program Files\\TortoiseSVN\\bin;C:\\Program Files (x86)\\Common Files\\Roxio Shared\\DLLShared\\;C:\\Program Files (x86)\\Common Files\\Roxio Shared\\10.0\\DLLShared\\;D:\\Program Files\\Git\\cmd;D:\\Program Files\\Git\\bin;C:\\Program Files\\Docker Toolbox;.",
                "boot-class-path-supported" : true,
                "boot-class-path" : "C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\resources.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\rt.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\sunrsasign.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\jsse.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\jce.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\charsets.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\jfr.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\classes",
                "input-arguments" : [
                    "-Dprogram.name=standalone.bat",
                    "-Xms128m",
                    "-Xmx512m",
                    "-Dhttp.nonProxyHosts=localhost,127.0.0.1,DellLat6410",
                    "-Djava.net.preferIPv4Stack=true",
                    "-Djboss.modules.system.pkgs=org.jboss.byteman",
                    "-Djava.awt.headless=true",
                    "-Djboss.management.native.port=9990",
                    "-Djboss.http.port=8080",
                    "-Dorg.jboss.boot.log.file=D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\log\\server.log",
                    "-Dlogging.configuration=file:D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\configuration/logging.properties"
                ],
                "start-time" : 1448991342039,
                "system-properties" : {
                    "awt.toolkit" : "sun.awt.windows.WToolkit",
                    "file.encoding" : "Cp1252",
                    "file.encoding.pkg" : "sun.io",
                    "file.separator" : "\\",
                    "http.nonProxyHosts" : "localhost,127.0.0.1,DellLat6410",
                    "ironjacamar.no_delist_resource_all" : "true",
                    "java.awt.graphicsenv" : "sun.awt.Win32GraphicsEnvironment",
                    "java.awt.headless" : "true",
                    "java.awt.printerjob" : "sun.awt.windows.WPrinterJob",
                    "java.class.path" : "D:\\michael\\java\\wildfly-8.2.0.Final\\jboss-modules.jar",
                    "java.class.version" : "52.0",
                    "java.endorsed.dirs" : "C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\endorsed",
                    "java.ext.dirs" : "C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\ext;C:\\Windows\\Sun\\Java\\lib\\ext",
                    "java.home" : "C:\\Program Files\\Java\\jdk1.8.0_45\\jre",
                    "java.io.tmpdir" : "C:\\Users\\admin\\AppData\\Local\\Temp\\",
                    "java.library.path" : "C:\\Program Files\\Java\\jdk1.8.0_45\\bin;C:\\Windows\\Sun\\Java\\bin;C:\\Windows\\system32;C:\\Windows;C:\\ProgramData\\Oracle\\Java\\javapath;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Program Files\\WIDCOMM\\Bluetooth Software\\;C:\\Program Files\\WIDCOMM\\Bluetooth Software\\syswow64;C:\\Program Files\\Intel\\WiFi\\bin\\;C:\\Program Files\\Common Files\\Intel\\WirelessCommon\\;C:\\Program Files\\TortoiseSVN\\bin;C:\\Program Files (x86)\\Common Files\\Roxio Shared\\DLLShared\\;C:\\Program Files (x86)\\Common Files\\Roxio Shared\\10.0\\DLLShared\\;C:\\Program Files\\TortoiseGit\\bin;D:\\Program Files\\Git\\cmd;D:\\Program Files\\Git\\bin;C:\\Windows\\system32;C:\\Windows;C:\\Windows\\System32\\Wbem;C:\\Windows\\System32\\WindowsPowerShell\\v1.0\\;C:\\Program Files\\WIDCOMM\\Bluetooth Software\\;C:\\Program Files\\WIDCOMM\\Bluetooth Software\\syswow64;C:\\Program Files\\Intel\\WiFi\\bin\\;C:\\Program Files\\Common Files\\Intel\\WirelessCommon\\;C:\\Program Files\\TortoiseSVN\\bin;C:\\Program Files (x86)\\Common Files\\Roxio Shared\\DLLShared\\;C:\\Program Files (x86)\\Common Files\\Roxio Shared\\10.0\\DLLShared\\;D:\\Program Files\\Git\\cmd;D:\\Program Files\\Git\\bin;C:\\Program Files\\Docker Toolbox;.",
                    "java.naming.factory.url.pkgs" : "org.jboss.as.naming.interfaces:org.jboss.ejb.client.naming",
                    "java.net.preferIPv4Stack" : "true",
                    "java.protocol.handler.pkgs" : "org.jboss.net.protocol|org.jboss.vfs.protocol",
                    "java.runtime.name" : "Java(TM) SE Runtime Environment",
                    "java.runtime.version" : "1.8.0_45-b15",
                    "java.specification.name" : "Java Platform API Specification",
                    "java.specification.vendor" : "Oracle Corporation",
                    "java.specification.version" : "1.8",
                    "java.util.logging.manager" : "org.jboss.logmanager.LogManager",
                    "java.vendor" : "Oracle Corporation",
                    "java.vendor.url" : "http://java.oracle.com/",
                    "java.vendor.url.bug" : "http://bugreport.sun.com/bugreport/",
                    "java.version" : "1.8.0_45",
                    "java.vm.info" : "mixed mode",
                    "java.vm.name" : "Java HotSpot(TM) 64-Bit Server VM",
                    "java.vm.specification.name" : "Java Virtual Machine Specification",
                    "java.vm.specification.vendor" : "Oracle Corporation",
                    "java.vm.specification.version" : "1.8",
                    "java.vm.vendor" : "Oracle Corporation",
                    "java.vm.version" : "25.45-b02",
                    "javax.management.builder.initial" : "org.jboss.as.jmx.PluggableMBeanServerBuilder",
                    "javax.xml.datatype.DatatypeFactory" : "__redirected.__DatatypeFactory",
                    "javax.xml.parsers.DocumentBuilderFactory" : "__redirected.__DocumentBuilderFactory",
                    "javax.xml.parsers.SAXParserFactory" : "__redirected.__SAXParserFactory",
                    "javax.xml.stream.XMLEventFactory" : "__redirected.__XMLEventFactory",
                    "javax.xml.stream.XMLInputFactory" : "__redirected.__XMLInputFactory",
                    "javax.xml.stream.XMLOutputFactory" : "__redirected.__XMLOutputFactory",
                    "javax.xml.transform.TransformerFactory" : "__redirected.__TransformerFactory",
                    "javax.xml.validation.SchemaFactory:http://www.w3.org/2001/XMLSchema" : "__redirected.__SchemaFactory",
                    "javax.xml.xpath.XPathFactory:http://java.sun.com/jaxp/xpath/dom" : "__redirected.__XPathFactory",
                    "jboss.home.dir" : "D:\\michael\\java\\wildfly-8.2.0.Final",
                    "jboss.host.name" : "delllat6410",
                    "jboss.http.port" : "8080",
                    "jboss.i18n.generate-proxies" : "true",
                    "jboss.management.native.port" : "9990",
                    "jboss.modules.dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\modules",
                    "jboss.modules.system.pkgs" : "org.jboss.byteman",
                    "jboss.node.name" : "delllat6410",
                    "jboss.qualified.host.name" : "delllat6410",
                    "jboss.server.base.dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone",
                    "jboss.server.config.dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\configuration",
                    "jboss.server.data.dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\data",
                    "jboss.server.deploy.dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\data\\content",
                    "jboss.server.log.dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\log",
                    "jboss.server.name" : "delllat6410",
                    "jboss.server.persist.config" : "true",
                    "jboss.server.temp.dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\tmp",
                    "line.separator" : "\r\n",
                    "logging.configuration" : "file:D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\configuration/logging.properties",
                    "module.path" : "D:\\michael\\java\\wildfly-8.2.0.Final\\modules",
                    "org.apache.xml.security.ignoreLineBreaks" : "true",
                    "org.jboss.boot.log.file" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\log\\server.log",
                    "org.jboss.com.sun.CORBA.ORBUseDynamicStub" : "true",
                    "org.jboss.resolver.warning" : "true",
                    "org.jboss.security.context.ThreadLocal" : "true",
                    "org.omg.CORBA.ORBClass" : "org.jacorb.orb.ORB",
                    "org.omg.CORBA.ORBSingletonClass" : "org.jacorb.orb.ORBSingleton",
                    "org.xml.sax.driver" : "__redirected.__XMLReaderFactory",
                    "os.arch" : "amd64",
                    "os.name" : "Windows 7",
                    "os.version" : "6.1",
                    "path.separator" : ";",
                    "program.name" : "standalone.bat",
                    "sun.arch.data.model" : "64",
                    "sun.boot.class.path" : "C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\resources.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\rt.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\sunrsasign.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\jsse.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\jce.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\charsets.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\lib\\jfr.jar;C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\classes",
                    "sun.boot.library.path" : "C:\\Program Files\\Java\\jdk1.8.0_45\\jre\\bin",
                    "sun.cpu.endian" : "little",
                    "sun.cpu.isalist" : "amd64",
                    "sun.desktop" : "windows",
                    "sun.io.unicode.encoding" : "UnicodeLittle",
                    "sun.java.command" : "D:\\michael\\java\\wildfly-8.2.0.Final\\jboss-modules.jar -mp D:\\michael\\java\\wildfly-8.2.0.Final\\modules -jaxpmodule javax.xml.jaxp-provider org.jboss.as.standalone -Djboss.home.dir=D:\\michael\\java\\wildfly-8.2.0.Final -c standalone-full.xml",
                    "sun.java.launcher" : "SUN_STANDARD",
                    "sun.jnu.encoding" : "Cp1252",
                    "sun.management.compiler" : "HotSpot 64-Bit Tiered Compilers",
                    "sun.nio.ch.bugLevel" : "",
                    "sun.os.patch.level" : "Service Pack 1",
                    "user.country" : "DE",
                    "user.dir" : "D:\\michael\\java\\wildfly-8.2.0.Final\\bin",
                    "user.home" : "C:\\Users\\admin",
                    "user.language" : "de",
                    "user.name" : "admin",
                    "user.script" : "",
                    "user.timezone" : "Europe/Berlin",
                    "user.variant" : ""
                },
                "uptime" : 235083,
                "object-name" : "java.lang:type=Runtime"
            },
            "threading" : {
                "all-thread-ids" : [
                    262,
                    261,
                    260,
                    259,
                    258,
                    257,
                    256,
                    255,
                    254,
                    253,
                    252,
                    251,
                    250,
                    249,
                    248,
                    247,
                    246,
                    245,
                    244,
                    243,
                    241,
                    239,
                    237,
                    235,
                    234,
                    233,
                    232,
                    231,
                    230,
                    229,
                    228,
                    227,
                    226,
                    225,
                    224,
                    223,
                    222,
                    221,
                    220,
                    219,
                    218,
                    217,
                    216,
                    215,
                    213,
                    211,
                    202,
                    198,
                    197,
                    196,
                    195,
                    194,
                    193,
                    192,
                    174,
                    173,
                    172,
                    171,
                    170,
                    169,
                    168,
                    167,
                    166,
                    165,
                    164,
                    163,
                    162,
                    161,
                    160,
                    159,
                    158,
                    156,
                    155,
                    152,
                    151,
                    147,
                    146,
                    121,
                    120,
                    119,
                    118,
                    117,
                    114,
                    113,
                    111,
                    110,
                    108,
                    107,
                    106,
                    105,
                    104,
                    103,
                    102,
                    101,
                    100,
                    99,
                    95,
                    94,
                    93,
                    92,
                    91,
                    90,
                    89,
                    88,
                    87,
                    86,
                    85,
                    84,
                    54,
                    53,
                    24,
                    22,
                    21,
                    20,
                    19,
                    18,
                    17,
                    16,
                    15,
                    14,
                    10,
                    5,
                    4,
                    3,
                    2
                ],
                "thread-contention-monitoring-supported" : true,
                "thread-cpu-time-supported" : true,
                "current-thread-cpu-time-supported" : true,
                "object-monitor-usage-supported" : true,
                "synchronizer-usage-supported" : true,
                "thread-contention-monitoring-enabled" : false,
                "thread-cpu-time-enabled" : true,
                "thread-count" : 125,
                "peak-thread-count" : 200,
                "total-started-thread-count" : 231,
                "daemon-thread-count" : 31,
                "current-thread-cpu-time" : 1840811800,
                "current-thread-user-time" : 1731611100,
                "object-name" : "java.lang:type=Threading"
            },
            "buffer-pool" : {"name" : {
                "mapped" : {
                    "count" : 0,
                    "memory-used" : 0,
                    "name" : "mapped",
                    "object-name" : "java.nio:type=BufferPool,name=mapped",
                    "total-capacity" : 0
                },
                "direct" : {
                    "count" : 14,
                    "memory-used" : 1128066,
                    "name" : "direct",
                    "object-name" : "java.nio:type=BufferPool,name=direct",
                    "total-capacity" : 1128065
                }
            }}
        }},
        "patching" : {
            "cumulative-patch-id" : "base",
            "patches" : [],
            "version" : "8.2.0.Final",
            "addon" : null,
            "layer" : {"base" : {
                "cumulative-patch-id" : "base",
                "patches" : []
            }}
        }
    },
    "deployment" : {
        "Einkaufsliste.war" : {
            "content" : [{
                "path" : "deployments\\Einkaufsliste.war",
                "relative-to" : "jboss.server.base.dir",
                "archive" : false
            }],
            "enabled" : true,
            "name" : "Einkaufsliste.war",
            "persistent" : false,
            "runtime-name" : "Einkaufsliste.war",
            "status" : "OK",
            "subdeployment" : null,
            "subsystem" : {
                "undertow" : {
                    "active-sessions" : 0,
                    "context-root" : "/",
                    "server" : "default-server",
                    "sessions-created" : 0,
                    "virtual-host" : "default-host",
                    "servlet" : {
                        "Faces Servlet" : {
                            "max-request-time" : 0,
                            "min-request-time" : 0,
                            "request-count" : 0,
                            "servlet-class" : "javax.faces.webapp.FacesServlet",
                            "servlet-name" : "Faces Servlet",
                            "total-request-time" : 0
                        },
                        "com.ms.einkaufsliste.util.PictureServlet" : {
                            "max-request-time" : 0,
                            "min-request-time" : 0,
                            "request-count" : 0,
                            "servlet-class" : "com.ms.einkaufsliste.util.PictureServlet",
                            "servlet-name" : "com.ms.einkaufsliste.util.PictureServlet",
                            "total-request-time" : 0
                        }
                    }
                },
                "ejb3" : {
                    "entity-bean" : null,
                    "message-driven-bean" : null,
                    "singleton-bean" : {
                        "DataBaseMock" : {
                            "component-class-name" : "DataBaseMock",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "MongoDBConnection" : {
                            "component-class-name" : "MongoDBConnection",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        }
                    },
                    "stateful-session-bean" : null,
                    "stateless-session-bean" : {
                        "ListController" : {
                            "component-class-name" : "ListController",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "DatabaseCleanUp" : {
                            "component-class-name" : "DatabaseCleanUp",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [{
                                "time-remaining" : 19219491,
                                "next-timeout" : 1449010800000,
                                "calendar-timer" : true,
                                "persistent" : true,
                                "schedule" : {
                                    "year" : "*",
                                    "month" : "*",
                                    "day-of-month" : "*",
                                    "day-of-week" : "*",
                                    "hour" : "00",
                                    "minute" : "0",
                                    "second" : "0",
                                    "timezone" : null,
                                    "start" : null,
                                    "end" : null
                                }
                            }],
                            "wait-time" : 0,
                            "service" : {"timer-service" : {"timer" : {"0bbe5871-5cd1-4d5e-959f-2f5f4e39f7bd" : {
                                "active" : true,
                                "calendar-timer" : true,
                                "info" : null,
                                "next-timeout" : 1449010800000,
                                "persistent" : true,
                                "primary-key" : null,
                                "schedule" : {
                                    "year" : "*",
                                    "month" : "*",
                                    "day-of-month" : "*",
                                    "day-of-week" : "*",
                                    "hour" : "00",
                                    "minute" : "0",
                                    "second" : "0",
                                    "timezone" : null,
                                    "start" : null,
                                    "end" : null
                                },
                                "time-remaining" : 19219491
                            }}}}
                        }
                    }
                }
            }
        },
        "lightfish4wildfly.war" : {
            "content" : [{
                "path" : "deployments\\lightfish4wildfly.war",
                "relative-to" : "jboss.server.base.dir",
                "archive" : false
            }],
            "enabled" : true,
            "name" : "lightfish4wildfly.war",
            "persistent" : false,
            "runtime-name" : "lightfish4wildfly.war",
            "status" : "OK",
            "subdeployment" : null,
            "subsystem" : {
                "jpa" : {
                    "default-datasource" : null,
                    "default-extended-persistence-inheritance" : "DEEP",
                    "hibernate-persistence-unit" : {"lightfish4wildfly.war#prod" : {
                        "close-statement-count" : 0,
                        "collection-fetch-count" : 0,
                        "collection-load-count" : 0,
                        "collection-recreated-count" : 0,
                        "collection-remove-count" : 0,
                        "collection-update-count" : 0,
                        "completed-transaction-count" : 0,
                        "connect-count" : 0,
                        "enabled" : false,
                        "entity-delete-count" : 0,
                        "entity-fetch-count" : 0,
                        "entity-insert-count" : 0,
                        "entity-load-count" : 0,
                        "entity-update-count" : 0,
                        "flush-count" : 0,
                        "hibernate-persistence-unit" : "lightfish4wildfly.war#prod",
                        "optimistic-failure-count" : 0,
                        "prepared-statement-count" : 0,
                        "query-cache-hit-count" : 0,
                        "query-cache-miss-count" : 0,
                        "query-cache-put-count" : 0,
                        "query-execution-count" : 0,
                        "query-execution-max-time" : 0,
                        "query-execution-max-time-query-string" : "null",
                        "second-level-cache-hit-count" : 0,
                        "second-level-cache-miss-count" : 0,
                        "second-level-cache-put-count" : 0,
                        "session-close-count" : 0,
                        "session-open-count" : 0,
                        "statistics-enabled" : false,
                        "successful-transaction-count" : 0,
                        "collection" : {
                            "org.lightfish.business.configuration.entity.Configuration.valueMap" : {
                                "collection-fetch-count" : 0,
                                "collection-load-count" : 0,
                                "collection-name" : "collection-name",
                                "collection-recreated-count" : 0,
                                "collection-remove-count" : 0,
                                "collection-update-count" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.Snapshot.apps" : {
                                "collection-fetch-count" : 0,
                                "collection-load-count" : 0,
                                "collection-name" : "collection-name",
                                "collection-recreated-count" : 0,
                                "collection-remove-count" : 0,
                                "collection-update-count" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.Snapshot.logRecords" : {
                                "collection-fetch-count" : 0,
                                "collection-load-count" : 0,
                                "collection-name" : "collection-name",
                                "collection-recreated-count" : 0,
                                "collection-remove-count" : 0,
                                "collection-update-count" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.Snapshot.pools" : {
                                "collection-fetch-count" : 0,
                                "collection-load-count" : 0,
                                "collection-name" : "collection-name",
                                "collection-recreated-count" : 0,
                                "collection-remove-count" : 0,
                                "collection-update-count" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.Application.components" : {
                                "collection-fetch-count" : 0,
                                "collection-load-count" : 0,
                                "collection-name" : "collection-name",
                                "collection-recreated-count" : 0,
                                "collection-remove-count" : 0,
                                "collection-update-count" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.LogRecord.nameValuePairs" : {
                                "collection-fetch-count" : 0,
                                "collection-load-count" : 0,
                                "collection-name" : "collection-name",
                                "collection-recreated-count" : 0,
                                "collection-remove-count" : 0,
                                "collection-update-count" : 0
                            }
                        },
                        "entity" : {
                            "org.lightfish.business.configuration.entity.Configuration" : {
                                "entity-delete-count" : 0,
                                "entity-fetch-count" : 0,
                                "entity-insert-count" : 0,
                                "entity-load-count" : 0,
                                "entity-update-count" : 0,
                                "optimistic-failure-count" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.Application" : {
                                "entity-delete-count" : 0,
                                "entity-fetch-count" : 0,
                                "entity-insert-count" : 0,
                                "entity-load-count" : 0,
                                "entity-update-count" : 0,
                                "optimistic-failure-count" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.ConnectionPool" : {
                                "entity-delete-count" : 0,
                                "entity-fetch-count" : 0,
                                "entity-insert-count" : 0,
                                "entity-load-count" : 0,
                                "entity-update-count" : 0,
                                "optimistic-failure-count" : 0
                            },
                            "org.lightfish.business.escalation.entity.Notifier" : {
                                "entity-delete-count" : 0,
                                "entity-fetch-count" : 0,
                                "entity-insert-count" : 0,
                                "entity-load-count" : 0,
                                "entity-update-count" : 0,
                                "optimistic-failure-count" : 0
                            },
                            "org.lightfish.business.escalation.entity.Script" : {
                                "entity-delete-count" : 0,
                                "entity-fetch-count" : 0,
                                "entity-insert-count" : 0,
                                "entity-load-count" : 0,
                                "entity-update-count" : 0,
                                "optimistic-failure-count" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.LogRecord" : {
                                "entity-delete-count" : 0,
                                "entity-fetch-count" : 0,
                                "entity-insert-count" : 0,
                                "entity-load-count" : 0,
                                "entity-update-count" : 0,
                                "optimistic-failure-count" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.Snapshot" : {
                                "entity-delete-count" : 0,
                                "entity-fetch-count" : 0,
                                "entity-insert-count" : 0,
                                "entity-load-count" : 0,
                                "entity-update-count" : 0,
                                "optimistic-failure-count" : 0
                            }
                        },
                        "entity-cache" : {
                            "org.lightfish.business.configuration.entity.Configuration" : {
                                "entity-cache-region-name" : "entity-cache-region-name",
                                "second-level-cache-count-in-memory" : 0,
                                "second-level-cache-hit-count" : 0,
                                "second-level-cache-miss-count" : 0,
                                "second-level-cache-put-count" : 0,
                                "second-level-cache-size-in-memory" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.Application" : {
                                "entity-cache-region-name" : "entity-cache-region-name",
                                "second-level-cache-count-in-memory" : 0,
                                "second-level-cache-hit-count" : 0,
                                "second-level-cache-miss-count" : 0,
                                "second-level-cache-put-count" : 0,
                                "second-level-cache-size-in-memory" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.ConnectionPool" : {
                                "entity-cache-region-name" : "entity-cache-region-name",
                                "second-level-cache-count-in-memory" : 0,
                                "second-level-cache-hit-count" : 0,
                                "second-level-cache-miss-count" : 0,
                                "second-level-cache-put-count" : 0,
                                "second-level-cache-size-in-memory" : 0
                            },
                            "org.lightfish.business.escalation.entity.Notifier" : {
                                "entity-cache-region-name" : "entity-cache-region-name",
                                "second-level-cache-count-in-memory" : 0,
                                "second-level-cache-hit-count" : 0,
                                "second-level-cache-miss-count" : 0,
                                "second-level-cache-put-count" : 0,
                                "second-level-cache-size-in-memory" : 0
                            },
                            "org.lightfish.business.escalation.entity.Script" : {
                                "entity-cache-region-name" : "entity-cache-region-name",
                                "second-level-cache-count-in-memory" : 0,
                                "second-level-cache-hit-count" : 0,
                                "second-level-cache-miss-count" : 0,
                                "second-level-cache-put-count" : 0,
                                "second-level-cache-size-in-memory" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.LogRecord" : {
                                "entity-cache-region-name" : "entity-cache-region-name",
                                "second-level-cache-count-in-memory" : 0,
                                "second-level-cache-hit-count" : 0,
                                "second-level-cache-miss-count" : 0,
                                "second-level-cache-put-count" : 0,
                                "second-level-cache-size-in-memory" : 0
                            },
                            "org.lightfish.business.servermonitoring.entity.Snapshot" : {
                                "entity-cache-region-name" : "entity-cache-region-name",
                                "second-level-cache-count-in-memory" : 0,
                                "second-level-cache-hit-count" : 0,
                                "second-level-cache-miss-count" : 0,
                                "second-level-cache-put-count" : 0,
                                "second-level-cache-size-in-memory" : 0
                            }
                        },
                        "query-cache" : null
                    }}
                },
                "undertow" : {
                    "active-sessions" : 0,
                    "context-root" : "/lightfish4wildfly",
                    "server" : "default-server",
                    "sessions-created" : 0,
                    "virtual-host" : "default-host",
                    "servlet" : {
                        "Faces Servlet" : {
                            "max-request-time" : 0,
                            "min-request-time" : 0,
                            "request-count" : 0,
                            "servlet-class" : "javax.faces.webapp.FacesServlet",
                            "servlet-name" : "Faces Servlet",
                            "total-request-time" : 0
                        },
                        "CometEscalator" : {
                            "max-request-time" : 0,
                            "min-request-time" : 0,
                            "request-count" : 0,
                            "servlet-class" : "org.lightfish.presentation.publication.escalation.CometEscalator",
                            "servlet-name" : "CometEscalator",
                            "total-request-time" : 0
                        },
                        "TunguskaGate" : {
                            "max-request-time" : 0,
                            "min-request-time" : 0,
                            "request-count" : 0,
                            "servlet-class" : "org.lightfish.presentation.publication.TunguskaGate",
                            "servlet-name" : "TunguskaGate",
                            "total-request-time" : 0
                        },
                        "org.lightfish.business.RESTConfig" : {
                            "max-request-time" : 0,
                            "min-request-time" : 0,
                            "request-count" : 0,
                            "servlet-class" : "org.jboss.resteasy.plugins.server.servlet.HttpServlet30Dispatcher",
                            "servlet-name" : "org.lightfish.business.RESTConfig",
                            "total-request-time" : 0
                        }
                    }
                },
                "ejb3" : {
                    "entity-bean" : null,
                    "message-driven-bean" : null,
                    "singleton-bean" : {
                        "Configurator" : {
                            "component-class-name" : "Configurator",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "DataSourceConfiguration" : {
                            "component-class-name" : "DataSourceConfiguration",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "SnapshotsSocket" : {
                            "component-class-name" : "SnapshotsSocket",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "SnapshotEventBroker" : {
                            "component-class-name" : "SnapshotEventBroker",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "CometTransmitterDelegate" : {
                            "component-class-name" : "CometTransmitterDelegate",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [
                                {
                                    "time-remaining" : -12770484,
                                    "next-timeout" : 1448978810000,
                                    "calendar-timer" : true,
                                    "persistent" : true,
                                    "schedule" : {
                                        "year" : "*",
                                        "month" : "*",
                                        "day-of-month" : "*",
                                        "day-of-week" : "*",
                                        "hour" : "*",
                                        "minute" : "*",
                                        "second" : "*/2",
                                        "timezone" : null,
                                        "start" : null,
                                        "end" : null
                                    }
                                },
                                {
                                    "time-remaining" : -484,
                                    "next-timeout" : 1448991580000,
                                    "calendar-timer" : true,
                                    "persistent" : true,
                                    "schedule" : {
                                        "year" : "*",
                                        "month" : "*",
                                        "day-of-month" : "*",
                                        "day-of-week" : "*",
                                        "hour" : "*",
                                        "minute" : "*",
                                        "second" : "*/2",
                                        "timezone" : null,
                                        "start" : null,
                                        "end" : null
                                    }
                                },
                                {
                                    "time-remaining" : -12718484,
                                    "next-timeout" : 1448978862000,
                                    "calendar-timer" : true,
                                    "persistent" : true,
                                    "schedule" : {
                                        "year" : "*",
                                        "month" : "*",
                                        "day-of-month" : "*",
                                        "day-of-week" : "*",
                                        "hour" : "*",
                                        "minute" : "*",
                                        "second" : "*/2",
                                        "timezone" : null,
                                        "start" : null,
                                        "end" : null
                                    }
                                }
                            ],
                            "wait-time" : 0,
                            "service" : {"timer-service" : {"timer" : {
                                "e57b545b-dbcc-4dda-a352-7edd16cbdb10" : {
                                    "active" : true,
                                    "calendar-timer" : true,
                                    "info" : null,
                                    "next-timeout" : 1448978810000,
                                    "persistent" : true,
                                    "primary-key" : null,
                                    "schedule" : {
                                        "year" : "*",
                                        "month" : "*",
                                        "day-of-month" : "*",
                                        "day-of-week" : "*",
                                        "hour" : "*",
                                        "minute" : "*",
                                        "second" : "*/2",
                                        "timezone" : null,
                                        "start" : null,
                                        "end" : null
                                    },
                                    "time-remaining" : -12770485
                                },
                                "1b070b65-990b-4515-8bce-fe4dfaa59840" : {
                                    "active" : true,
                                    "calendar-timer" : true,
                                    "info" : null,
                                    "next-timeout" : 1448978862000,
                                    "persistent" : true,
                                    "primary-key" : null,
                                    "schedule" : {
                                        "year" : "*",
                                        "month" : "*",
                                        "day-of-month" : "*",
                                        "day-of-week" : "*",
                                        "hour" : "*",
                                        "minute" : "*",
                                        "second" : "*/2",
                                        "timezone" : null,
                                        "start" : null,
                                        "end" : null
                                    },
                                    "time-remaining" : -12718485
                                },
                                "61edea06-9635-4738-8e95-6c140051368a" : {
                                    "active" : true,
                                    "calendar-timer" : true,
                                    "info" : null,
                                    "next-timeout" : 1448991580000,
                                    "persistent" : true,
                                    "primary-key" : null,
                                    "schedule" : {
                                        "year" : "*",
                                        "month" : "*",
                                        "day-of-month" : "*",
                                        "day-of-week" : "*",
                                        "hour" : "*",
                                        "minute" : "*",
                                        "second" : "*/2",
                                        "timezone" : null,
                                        "start" : null,
                                        "end" : null
                                    },
                                    "time-remaining" : -485
                                }
                            }}}
                        },
                        "EscalationNotificationBroker" : {
                            "component-class-name" : "EscalationNotificationBroker",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "SnapshotEscalator" : {
                            "component-class-name" : "SnapshotEscalator",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "ApplicationsSocket" : {
                            "component-class-name" : "ApplicationsSocket",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "GlassfishAuthenticator" : {
                            "component-class-name" : "GlassfishAuthenticator",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "MonitoringController" : {
                            "component-class-name" : "MonitoringController",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [{
                                "time-remaining" : -11508482,
                                "next-timeout" : 1448980072000,
                                "calendar-timer" : true,
                                "persistent" : true,
                                "schedule" : {
                                    "year" : "*",
                                    "month" : "*",
                                    "day-of-month" : "*",
                                    "day-of-week" : "*",
                                    "hour" : "*",
                                    "minute" : "*",
                                    "second" : "*/2",
                                    "timezone" : null,
                                    "start" : null,
                                    "end" : null
                                }
                            }],
                            "wait-time" : 0,
                            "service" : {"timer-service" : {"timer" : {"95a92e7d-fb5d-416d-8a68-497d626c2e21" : {
                                "active" : true,
                                "calendar-timer" : true,
                                "info" : null,
                                "next-timeout" : 1448980072000,
                                "persistent" : true,
                                "primary-key" : null,
                                "schedule" : {
                                    "year" : "*",
                                    "month" : "*",
                                    "day-of-month" : "*",
                                    "day-of-week" : "*",
                                    "hour" : "*",
                                    "minute" : "*",
                                    "second" : "*/2",
                                    "timezone" : null,
                                    "start" : null,
                                    "end" : null
                                },
                                "time-remaining" : -11508483
                            }}}}
                        },
                        "SessionTokenRetriever" : {
                            "component-class-name" : "SessionTokenRetriever",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "LoggerProducer" : {
                            "component-class-name" : "LoggerProducer",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        }
                    },
                    "stateful-session-bean" : null,
                    "stateless-session-bean" : {
                        "EditNotifier" : {
                            "component-class-name" : "EditNotifier",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "ConfigurationStore" : {
                            "component-class-name" : "ConfigurationStore",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "NotifierStore" : {
                            "component-class-name" : "NotifierStore",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "DomainInformation" : {
                            "component-class-name" : "DomainInformation",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "PollingResource" : {
                            "component-class-name" : "PollingResource",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "LogsService" : {
                            "component-class-name" : "LogsService",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "ServerInformation" : {
                            "component-class-name" : "ServerInformation",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "MonitoringResource" : {
                            "component-class-name" : "MonitoringResource",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "ScriptingResource" : {
                            "component-class-name" : "ScriptingResource",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "AddScript" : {
                            "component-class-name" : "AddScript",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "AsyncTransmitterService" : {
                            "component-class-name" : "AsyncTransmitterService",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "ApplicationMonitoring" : {
                            "component-class-name" : "ApplicationMonitoring",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "ParallelDataCollectionAction" : {
                            "component-class-name" : "ParallelDataCollectionAction",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "ParallelDataCollectionExecutor" : {
                            "component-class-name" : "ParallelDataCollectionExecutor",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "EditScript" : {
                            "component-class-name" : "EditScript",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "ServerInfoResource" : {
                            "component-class-name" : "ServerInfoResource",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        },
                        "ApplicationsResource" : {
                            "component-class-name" : "ApplicationsResource",
                            "declared-roles" : [],
                            "execution-time" : 0,
                            "invocations" : 0,
                            "methods" : {},
                            "peak-concurrent-invocations" : 0,
                            "pool-available-count" : null,
                            "pool-create-count" : null,
                            "pool-current-size" : null,
                            "pool-max-size" : null,
                            "pool-name" : null,
                            "pool-remove-count" : null,
                            "run-as-role" : null,
                            "security-domain" : "other",
                            "timers" : [],
                            "wait-time" : 0,
                            "service" : null
                        }
                    }
                }
            }
        }
    },
    "deployment-overlay" : null,
    "extension" : {
        "org.jboss.as.clustering.infinispan" : {
            "module" : "org.jboss.as.clustering.infinispan",
            "subsystem" : {"infinispan" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : [
                    "urn:jboss:domain:infinispan:1.0",
                    "urn:jboss:domain:infinispan:1.1",
                    "urn:jboss:domain:infinispan:1.2",
                    "urn:jboss:domain:infinispan:1.3",
                    "urn:jboss:domain:infinispan:1.4",
                    "urn:jboss:domain:infinispan:2.0"
                ]
            }}
        },
        "org.jboss.as.connector" : {
            "module" : "org.jboss.as.connector",
            "subsystem" : {
                "datasources" : {
                    "management-major-version" : 2,
                    "management-micro-version" : 0,
                    "management-minor-version" : 0,
                    "xml-namespaces" : [
                        "urn:jboss:domain:datasources:1.0",
                        "urn:jboss:domain:datasources:1.1",
                        "urn:jboss:domain:datasources:2.0"
                    ]
                },
                "resource-adapters" : {
                    "management-major-version" : 2,
                    "management-micro-version" : 0,
                    "management-minor-version" : 0,
                    "xml-namespaces" : [
                        "urn:jboss:domain:resource-adapters:1.0",
                        "urn:jboss:domain:resource-adapters:1.1",
                        "urn:jboss:domain:resource-adapters:2.0"
                    ]
                },
                "jca" : {
                    "management-major-version" : 2,
                    "management-micro-version" : 0,
                    "management-minor-version" : 0,
                    "xml-namespaces" : [
                        "urn:jboss:domain:jca:1.0",
                        "urn:jboss:domain:jca:1.1",
                        "urn:jboss:domain:jca:2.0"
                    ]
                }
            }
        },
        "org.jboss.as.deployment-scanner" : {
            "module" : "org.jboss.as.deployment-scanner",
            "subsystem" : {"deployment-scanner" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : [
                    "urn:jboss:domain:deployment-scanner:1.0",
                    "urn:jboss:domain:deployment-scanner:1.1",
                    "urn:jboss:domain:deployment-scanner:2.0"
                ]
            }}
        },
        "org.jboss.as.ee" : {
            "module" : "org.jboss.as.ee",
            "subsystem" : {"ee" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : [
                    "urn:jboss:domain:ee:1.0",
                    "urn:jboss:domain:ee:1.1",
                    "urn:jboss:domain:ee:2.0"
                ]
            }}
        },
        "org.jboss.as.ejb3" : {
            "module" : "org.jboss.as.ejb3",
            "subsystem" : {"ejb3" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : [
                    "urn:jboss:domain:ejb3:1.0",
                    "urn:jboss:domain:ejb3:1.1",
                    "urn:jboss:domain:ejb3:1.2",
                    "urn:jboss:domain:ejb3:1.3",
                    "urn:jboss:domain:ejb3:1.4",
                    "urn:jboss:domain:ejb3:2.0"
                ]
            }}
        },
        "org.jboss.as.jacorb" : {
            "module" : "org.jboss.as.jacorb",
            "subsystem" : {"jacorb" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 3,
                "xml-namespaces" : [
                    "urn:jboss:domain:jacorb:1.0",
                    "urn:jboss:domain:jacorb:1.1",
                    "urn:jboss:domain:jacorb:1.2",
                    "urn:jboss:domain:jacorb:1.3"
                ]
            }}
        },
        "org.jboss.as.jaxrs" : {
            "module" : "org.jboss.as.jaxrs",
            "subsystem" : {"jaxrs" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : ["urn:jboss:domain:jaxrs:1.0"]
            }}
        },
        "org.jboss.as.jdr" : {
            "module" : "org.jboss.as.jdr",
            "subsystem" : {"jdr" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 2,
                "xml-namespaces" : ["urn:jboss:domain:jdr:1.0"]
            }}
        },
        "org.jboss.as.jmx" : {
            "module" : "org.jboss.as.jmx",
            "subsystem" : {"jmx" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 2,
                "xml-namespaces" : [
                    "urn:jboss:domain:jmx:1.0",
                    "urn:jboss:domain:jmx:1.1",
                    "urn:jboss:domain:jmx:1.2",
                    "urn:jboss:domain:jmx:1.3"
                ]
            }}
        },
        "org.jboss.as.jpa" : {
            "module" : "org.jboss.as.jpa",
            "subsystem" : {"jpa" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 2,
                "xml-namespaces" : [
                    "urn:jboss:domain:jpa:1.1",
                    "urn:jboss:domain:jpa:1.0"
                ]
            }}
        },
        "org.jboss.as.jsf" : {
            "module" : "org.jboss.as.jsf",
            "subsystem" : {"jsf" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : ["urn:jboss:domain:jsf:1.0"]
            }}
        },
        "org.jboss.as.jsr77" : {
            "module" : "org.jboss.as.jsr77",
            "subsystem" : {"jsr77" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : ["urn:jboss:domain:jsr77:1.0"]
            }}
        },
        "org.jboss.as.logging" : {
            "module" : "org.jboss.as.logging",
            "subsystem" : {"logging" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 1,
                "xml-namespaces" : [
                    "urn:jboss:domain:logging:1.0",
                    "urn:jboss:domain:logging:1.1",
                    "urn:jboss:domain:logging:1.2",
                    "urn:jboss:domain:logging:1.3",
                    "urn:jboss:domain:logging:1.4",
                    "urn:jboss:domain:logging:2.0"
                ]
            }}
        },
        "org.jboss.as.mail" : {
            "module" : "org.jboss.as.mail",
            "subsystem" : {"mail" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : [
                    "urn:jboss:domain:mail:1.0",
                    "urn:jboss:domain:mail:1.1",
                    "urn:jboss:domain:mail:2.0"
                ]
            }}
        },
        "org.jboss.as.messaging" : {
            "module" : "org.jboss.as.messaging",
            "subsystem" : {"messaging" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 1,
                "xml-namespaces" : [
                    "urn:jboss:domain:messaging:1.0",
                    "urn:jboss:domain:messaging:1.1",
                    "urn:jboss:domain:messaging:1.2",
                    "urn:jboss:domain:messaging:1.3",
                    "urn:jboss:domain:messaging:1.4",
                    "urn:jboss:domain:messaging:2.0"
                ]
            }}
        },
        "org.jboss.as.naming" : {
            "module" : "org.jboss.as.naming",
            "subsystem" : {"naming" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : [
                    "urn:jboss:domain:naming:1.0",
                    "urn:jboss:domain:naming:1.1",
                    "urn:jboss:domain:naming:1.2",
                    "urn:jboss:domain:naming:1.3",
                    "urn:jboss:domain:naming:1.4",
                    "urn:jboss:domain:naming:2.0"
                ]
            }}
        },
        "org.jboss.as.pojo" : {
            "module" : "org.jboss.as.pojo",
            "subsystem" : {"pojo" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : ["urn:jboss:domain:pojo:1.0"]
            }}
        },
        "org.jboss.as.remoting" : {
            "module" : "org.jboss.as.remoting",
            "subsystem" : {"remoting" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 1,
                "xml-namespaces" : [
                    "urn:jboss:domain:remoting:1.0",
                    "urn:jboss:domain:remoting:1.1",
                    "urn:jboss:domain:remoting:2.0"
                ]
            }}
        },
        "org.jboss.as.sar" : {
            "module" : "org.jboss.as.sar",
            "subsystem" : {"sar" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : ["urn:jboss:domain:sar:1.0"]
            }}
        },
        "org.jboss.as.security" : {
            "module" : "org.jboss.as.security",
            "subsystem" : {"security" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 3,
                "xml-namespaces" : [
                    "urn:jboss:domain:security:1.0",
                    "urn:jboss:domain:security:1.1",
                    "urn:jboss:domain:security:1.2"
                ]
            }}
        },
        "org.jboss.as.transactions" : {
            "module" : "org.jboss.as.transactions",
            "subsystem" : {"transactions" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : [
                    "urn:jboss:domain:transactions:1.0",
                    "urn:jboss:domain:transactions:1.1",
                    "urn:jboss:domain:transactions:1.2",
                    "urn:jboss:domain:transactions:1.3",
                    "urn:jboss:domain:transactions:1.4",
                    "urn:jboss:domain:transactions:2.0"
                ]
            }}
        },
        "org.jboss.as.webservices" : {
            "module" : "org.jboss.as.webservices",
            "subsystem" : {"webservices" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 2,
                "xml-namespaces" : [
                    "urn:jboss:domain:webservices:1.0",
                    "urn:jboss:domain:webservices:1.1",
                    "urn:jboss:domain:webservices:1.2"
                ]
            }}
        },
        "org.jboss.as.weld" : {
            "module" : "org.jboss.as.weld",
            "subsystem" : {"weld" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : [
                    "urn:jboss:domain:weld:1.0",
                    "urn:jboss:domain:weld:2.0"
                ]
            }}
        },
        "org.wildfly.extension.batch" : {
            "module" : "org.wildfly.extension.batch",
            "subsystem" : {"batch" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : ["urn:jboss:domain:batch:1.0"]
            }}
        },
        "org.wildfly.extension.io" : {
            "module" : "org.wildfly.extension.io",
            "subsystem" : {"io" : {
                "management-major-version" : 1,
                "management-micro-version" : 0,
                "management-minor-version" : 1,
                "xml-namespaces" : [
                    "urn:jboss:domain:io:1.0",
                    "urn:jboss:domain:io:1.1"
                ]
            }}
        },
        "org.wildfly.extension.undertow" : {
            "module" : "org.wildfly.extension.undertow",
            "subsystem" : {"undertow" : {
                "management-major-version" : 2,
                "management-micro-version" : 0,
                "management-minor-version" : 0,
                "xml-namespaces" : [
                    "urn:jboss:domain:undertow:1.0",
                    "urn:jboss:domain:undertow:1.1",
                    "urn:jboss:domain:undertow:1.2"
                ]
            }}
        }
    },
    "interface" : {
        "management" : {
            "any" : null,
            "any-address" : null,
            "any-ipv4-address" : null,
            "any-ipv6-address" : null,
            "inet-address" : {
                "EXPRESSION_VALUE" : "${jboss.bind.address.management:127.0.0.1}"
            },
            "link-local-address" : null,
            "loopback" : null,
            "loopback-address" : null,
            "multicast" : null,
            "name" : "management",
            "nic" : null,
            "nic-match" : null,
            "not" : null,
            "point-to-point" : null,
            "public-address" : null,
            "resolved-address" : "127.0.0.1",
            "site-local-address" : null,
            "subnet-match" : null,
            "up" : null,
            "virtual" : null
        },
        "public" : {
            "any" : null,
            "any-address" : null,
            "any-ipv4-address" : null,
            "any-ipv6-address" : null,
            "inet-address" : {
                "EXPRESSION_VALUE" : "${jboss.bind.address:127.0.0.1}"
            },
            "link-local-address" : null,
            "loopback" : null,
            "loopback-address" : null,
            "multicast" : null,
            "name" : "public",
            "nic" : null,
            "nic-match" : null,
            "not" : null,
            "point-to-point" : null,
            "public-address" : null,
            "resolved-address" : "127.0.0.1",
            "site-local-address" : null,
            "subnet-match" : null,
            "up" : null,
            "virtual" : null
        },
        "unsecure" : {
            "any" : null,
            "any-address" : null,
            "any-ipv4-address" : null,
            "any-ipv6-address" : null,
            "inet-address" : {
                "EXPRESSION_VALUE" : "${jboss.bind.address.unsecure:127.0.0.1}"
            },
            "link-local-address" : null,
            "loopback" : null,
            "loopback-address" : null,
            "multicast" : null,
            "name" : "unsecure",
            "nic" : null,
            "nic-match" : null,
            "not" : null,
            "point-to-point" : null,
            "public-address" : null,
            "resolved-address" : "127.0.0.1",
            "site-local-address" : null,
            "subnet-match" : null,
            "up" : null,
            "virtual" : null
        }
    },
    "path" : {
        "jboss.server.log.dir" : {
            "name" : "jboss.server.log.dir",
            "path" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\log",
            "read-only" : true,
            "relative-to" : null
        },
        "jboss.server.data.dir" : {
            "name" : "jboss.server.data.dir",
            "path" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\data",
            "read-only" : true,
            "relative-to" : null
        },
        "jboss.server.base.dir" : {
            "name" : "jboss.server.base.dir",
            "path" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone",
            "read-only" : true,
            "relative-to" : null
        },
        "jboss.server.config.dir" : {
            "name" : "jboss.server.config.dir",
            "path" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\configuration",
            "read-only" : true,
            "relative-to" : null
        },
        "user.dir" : {
            "name" : "user.dir",
            "path" : "D:\\michael\\java\\wildfly-8.2.0.Final\\bin",
            "read-only" : true,
            "relative-to" : null
        },
        "user.home" : {
            "name" : "user.home",
            "path" : "C:\\Users\\admin",
            "read-only" : true,
            "relative-to" : null
        },
        "jboss.server.temp.dir" : {
            "name" : "jboss.server.temp.dir",
            "path" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\tmp",
            "read-only" : true,
            "relative-to" : null
        },
        "jboss.controller.temp.dir" : {
            "name" : "jboss.controller.temp.dir",
            "path" : "D:\\michael\\java\\wildfly-8.2.0.Final\\standalone\\tmp",
            "read-only" : true,
            "relative-to" : null
        },
        "jboss.home.dir" : {
            "name" : "jboss.home.dir",
            "path" : "D:\\michael\\java\\wildfly-8.2.0.Final",
            "read-only" : true,
            "relative-to" : null
        },
        "java.home" : {
            "name" : "java.home",
            "path" : "C:\\Program Files\\Java\\jdk1.8.0_45\\jre",
            "read-only" : true,
            "relative-to" : null
        }
    },
    "socket-binding-group" : {"standard-sockets" : {
        "default-interface" : "public",
        "name" : "standard-sockets",
        "port-offset" : {
            "EXPRESSION_VALUE" : "${jboss.socket.binding.port-offset:0}"
        },
        "local-destination-outbound-socket-binding" : null,
        "remote-destination-outbound-socket-binding" : {"mail-smtp" : {
            "fixed-source-port" : false,
            "host" : "localhost",
            "port" : 25,
            "source-interface" : null,
            "source-port" : null
        }},
        "socket-binding" : {
            "management-http" : {
                "bound" : true,
                "bound-address" : "127.0.0.1",
                "bound-port" : 9990,
                "client-mappings" : null,
                "fixed-port" : false,
                "interface" : "management",
                "multicast-address" : null,
                "multicast-port" : null,
                "name" : "management-http",
                "port" : {
                    "EXPRESSION_VALUE" : "${jboss.management.http.port:9990}"
                }
            },
            "management-https" : {
                "bound" : false,
                "bound-address" : null,
                "bound-port" : null,
                "client-mappings" : null,
                "fixed-port" : false,
                "interface" : "management",
                "multicast-address" : null,
                "multicast-port" : null,
                "name" : "management-https",
                "port" : {
                    "EXPRESSION_VALUE" : "${jboss.management.https.port:9993}"
                }
            },
            "ajp" : {
                "bound" : false,
                "bound-address" : null,
                "bound-port" : null,
                "client-mappings" : null,
                "fixed-port" : false,
                "interface" : null,
                "multicast-address" : null,
                "multicast-port" : null,
                "name" : "ajp",
                "port" : {
                    "EXPRESSION_VALUE" : "${jboss.ajp.port:8009}"
                }
            },
            "http" : {
                "bound" : true,
                "bound-address" : "127.0.0.1",
                "bound-port" : 8080,
                "client-mappings" : null,
                "fixed-port" : false,
                "interface" : null,
                "multicast-address" : null,
                "multicast-port" : null,
                "name" : "http",
                "port" : {
                    "EXPRESSION_VALUE" : "${jboss.http.port:8080}"
                }
            },
            "https" : {
                "bound" : true,
                "bound-address" : "127.0.0.1",
                "bound-port" : 8443,
                "client-mappings" : null,
                "fixed-port" : false,
                "interface" : null,
                "multicast-address" : null,
                "multicast-port" : null,
                "name" : "https",
                "port" : {
                    "EXPRESSION_VALUE" : "${jboss.https.port:8443}"
                }
            },
            "jacorb" : {
                "bound" : false,
                "bound-address" : null,
                "bound-port" : null,
                "client-mappings" : null,
                "fixed-port" : false,
                "interface" : "unsecure",
                "multicast-address" : null,
                "multicast-port" : null,
                "name" : "jacorb",
                "port" : 3528
            },
            "jacorb-ssl" : {
                "bound" : false,
                "bound-address" : null,
                "bound-port" : null,
                "client-mappings" : null,
                "fixed-port" : false,
                "interface" : "unsecure",
                "multicast-address" : null,
                "multicast-port" : null,
                "name" : "jacorb-ssl",
                "port" : 3529
            },
            "messaging-group" : {
                "bound" : false,
                "bound-address" : null,
                "bound-port" : null,
                "client-mappings" : null,
                "fixed-port" : false,
                "interface" : null,
                "multicast-address" : {
                    "EXPRESSION_VALUE" : "${jboss.messaging.group.address:231.7.7.7}"
                },
                "multicast-port" : {
                    "EXPRESSION_VALUE" : "${jboss.messaging.group.port:9876}"
                },
                "name" : "messaging-group",
                "port" : 0
            },
            "txn-recovery-environment" : {
                "bound" : false,
                "bound-address" : null,
                "bound-port" : null,
                "client-mappings" : null,
                "fixed-port" : false,
                "interface" : null,
                "multicast-address" : null,
                "multicast-port" : null,
                "name" : "txn-recovery-environment",
                "port" : 4712
            },
            "txn-status-manager" : {
                "bound" : false,
                "bound-address" : null,
                "bound-port" : null,
                "client-mappings" : null,
                "fixed-port" : false,
                "interface" : null,
                "multicast-address" : null,
                "multicast-port" : null,
                "name" : "txn-status-manager",
                "port" : 4713
            }
        }
    }},
    "subsystem" : {
        "logging" : {
            "add-logging-api-dependencies" : true,
            "use-deployment-logging-config" : true,
            "async-handler" : null,
            "console-handler" : {"CONSOLE" : {
                "autoflush" : true,
                "enabled" : true,
                "encoding" : null,
                "filter" : null,
                "filter-spec" : null,
                "formatter" : "%d{HH:mm:ss,SSS} %-5p [%c] (%t) %s%E%n",
                "level" : "INFO",
                "name" : "CONSOLE",
                "named-formatter" : "COLOR-PATTERN",
                "target" : "System.out"
            }},
            "custom-formatter" : null,
            "custom-handler" : null,
            "file-handler" : null,
            "log-file" : {
                "server.log" : {
                    "file-size" : 645337712,
                    "last-modified-time" : 1448991578389,
                    "last-modified-timestamp" : "2015-12-01T18:39:38.389+0100"
                },
                "server.log.2015-11-18" : {
                    "file-size" : 455437,
                    "last-modified-time" : 1447879599104,
                    "last-modified-timestamp" : "2015-11-18T21:46:39.104+0100"
                },
                "server.log.2015-11-19" : {
                    "file-size" : 448281,
                    "last-modified-time" : 1447944079660,
                    "last-modified-timestamp" : "2015-11-19T15:41:19.660+0100"
                },
                "server.log.2015-11-23" : {
                    "file-size" : 2976234,
                    "last-modified-time" : 1448279395334,
                    "last-modified-timestamp" : "2015-11-23T12:49:55.334+0100"
                },
                "server.log.2015-11-24" : {
                    "file-size" : 180067,
                    "last-modified-time" : 1448355646105,
                    "last-modified-timestamp" : "2015-11-24T10:00:46.105+0100"
                },
                "server.log.2015-11-25" : {
                    "file-size" : 850782,
                    "last-modified-time" : 1448470204430,
                    "last-modified-timestamp" : "2015-11-25T17:50:04.430+0100"
                },
                "server.log.2015-11-26" : {
                    "file-size" : 1329359,
                    "last-modified-time" : 1448571219955,
                    "last-modified-timestamp" : "2015-11-26T21:53:39.955+0100"
                },
                "server.log.2015-11-27" : {
                    "file-size" : 2574737,
                    "last-modified-time" : 1448653765957,
                    "last-modified-timestamp" : "2015-11-27T20:49:25.957+0100"
                },
                "server.log.2015-11-28" : {
                    "file-size" : 240266462,
                    "last-modified-time" : 1448772642960,
                    "last-modified-timestamp" : "2015-11-29T05:50:42.960+0100"
                },
                "server.log.2015-11-29" : {
                    "file-size" : 391391296,
                    "last-modified-time" : 1448820660386,
                    "last-modified-timestamp" : "2015-11-29T19:11:00.386+0100"
                }
            },
            "logger" : {
                "com.arjuna" : {
                    "category" : "com.arjuna",
                    "filter" : null,
                    "filter-spec" : null,
                    "handlers" : null,
                    "level" : "WARN",
                    "use-parent-handlers" : true
                },
                "org.apache.tomcat.util.modeler" : {
                    "category" : "org.apache.tomcat.util.modeler",
                    "filter" : null,
                    "filter-spec" : null,
                    "handlers" : null,
                    "level" : "WARN",
                    "use-parent-handlers" : true
                },
                "org.jboss.as.config" : {
                    "category" : "org.jboss.as.config",
                    "filter" : null,
                    "filter-spec" : null,
                    "handlers" : null,
                    "level" : "DEBUG",
                    "use-parent-handlers" : true
                },
                "sun.rmi" : {
                    "category" : "sun.rmi",
                    "filter" : null,
                    "filter-spec" : null,
                    "handlers" : null,
                    "level" : "WARN",
                    "use-parent-handlers" : true
                },
                "jacorb" : {
                    "category" : "jacorb",
                    "filter" : null,
                    "filter-spec" : null,
                    "handlers" : null,
                    "level" : "WARN",
                    "use-parent-handlers" : true
                },
                "jacorb.config" : {
                    "category" : "jacorb.config",
                    "filter" : null,
                    "filter-spec" : null,
                    "handlers" : null,
                    "level" : "ERROR",
                    "use-parent-handlers" : true
                },
                "javax.ws.rs.client" : {
                    "category" : "javax.ws.rs.client",
                    "filter" : null,
                    "filter-spec" : null,
                    "handlers" : null,
                    "level" : "ALL",
                    "use-parent-handlers" : true
                }
            },
            "logging-profile" : null,
            "pattern-formatter" : {
                "PATTERN" : {
                    "color-map" : null,
                    "pattern" : "%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c] (%t) %s%E%n"
                },
                "COLOR-PATTERN" : {
                    "color-map" : null,
                    "pattern" : "%K{level}%d{HH:mm:ss,SSS} %-5p [%c] (%t) %s%E%n"
                }
            },
            "periodic-rotating-file-handler" : {"FILE" : {
                "append" : true,
                "autoflush" : true,
                "enabled" : true,
                "encoding" : null,
                "file" : {
                    "relative-to" : "jboss.server.log.dir",
                    "path" : "server.log"
                },
                "filter" : null,
                "filter-spec" : null,
                "formatter" : "%d{HH:mm:ss,SSS} %-5p [%c] (%t) %s%E%n",
                "level" : "ALL",
                "name" : "FILE",
                "named-formatter" : "PATTERN",
                "suffix" : ".yyyy-MM-dd"
            }},
            "root-logger" : {"ROOT" : {
                "filter" : null,
                "filter-spec" : null,
                "handlers" : [
                    "CONSOLE",
                    "FILE"
                ],
                "level" : "INFO"
            }},
            "size-rotating-file-handler" : null,
            "syslog-handler" : null
        },
        "batch" : {
            "job-repository-type" : "in-memory",
            "job-repository" : {"jdbc" : {"jndi-name" : null}},
            "thread-factory" : null,
            "thread-pool" : {"batch" : {
                "keepalive-time" : {
                    "time" : 30,
                    "unit" : "SECONDS"
                },
                "max-threads" : 10,
                "name" : "batch",
                "thread-factory" : null
            }}
        },
        "datasources" : {
            "installed-drivers" : [
                {
                    "driver-name" : "lightfish4wildfly.war_org.h2.Driver_1_4",
                    "deployment-name" : "lightfish4wildfly.war_org.h2.Driver_1_4",
                    "driver-module-name" : null,
                    "module-slot" : null,
                    "driver-datasource-class-name" : null,
                    "driver-xa-datasource-class-name" : null,
                    "driver-class-name" : "org.h2.Driver",
                    "driver-major-version" : 1,
                    "driver-minor-version" : 4,
                    "jdbc-compliant" : true
                },
                {
                    "driver-name" : "derby-client",
                    "deployment-name" : null,
                    "driver-module-name" : "org.apache.derbynet",
                    "module-slot" : "main",
                    "driver-datasource-class-name" : "org.apache.derby.jdbc.ClientDataSource",
                    "driver-xa-datasource-class-name" : "org.apache.derby.jdbc.ClientXADataSource",
                    "driver-class-name" : "org.apache.derby.jdbc.ClientDriver",
                    "driver-major-version" : 10,
                    "driver-minor-version" : 11,
                    "jdbc-compliant" : true
                },
                {
                    "driver-name" : "h2",
                    "deployment-name" : null,
                    "driver-module-name" : "com.h2database.h2",
                    "module-slot" : "main",
                    "driver-datasource-class-name" : "",
                    "driver-xa-datasource-class-name" : "org.h2.jdbcx.JdbcDataSource",
                    "driver-class-name" : "org.h2.Driver",
                    "driver-major-version" : 1,
                    "driver-minor-version" : 3,
                    "jdbc-compliant" : true
                }
            ],
            "data-source" : {
                "ExampleDS" : {
                    "allocation-retry" : null,
                    "allocation-retry-wait-millis" : null,
                    "allow-multiple-users" : false,
                    "background-validation" : null,
                    "background-validation-millis" : null,
                    "blocking-timeout-wait-millis" : null,
                    "capacity-decrementer-class" : null,
                    "capacity-decrementer-properties" : null,
                    "capacity-incrementer-class" : null,
                    "capacity-incrementer-properties" : null,
                    "check-valid-connection-sql" : null,
                    "connection-listener-class" : null,
                    "connection-listener-property" : null,
                    "connection-properties" : null,
                    "connection-url" : "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE",
                    "datasource-class" : null,
                    "driver-class" : null,
                    "driver-name" : "h2",
                    "enabled" : true,
                    "exception-sorter-class-name" : null,
                    "exception-sorter-properties" : null,
                    "flush-strategy" : null,
                    "idle-timeout-minutes" : null,
                    "initial-pool-size" : null,
                    "jndi-name" : "java:jboss/datasources/ExampleDS",
                    "jta" : true,
                    "max-pool-size" : null,
                    "min-pool-size" : null,
                    "new-connection-sql" : null,
                    "password" : "sa",
                    "pool-prefill" : null,
                    "pool-use-strict-min" : null,
                    "prepared-statements-cache-size" : null,
                    "query-timeout" : null,
                    "reauth-plugin-class-name" : null,
                    "reauth-plugin-properties" : null,
                    "security-domain" : null,
                    "set-tx-query-timeout" : false,
                    "share-prepared-statements" : false,
                    "spy" : false,
                    "stale-connection-checker-class-name" : null,
                    "stale-connection-checker-properties" : null,
                    "track-statements" : "NOWARN",
                    "transaction-isolation" : null,
                    "url-delimiter" : null,
                    "url-selector-strategy-class-name" : null,
                    "use-ccm" : true,
                    "use-fast-fail" : false,
                    "use-java-context" : true,
                    "use-try-lock" : null,
                    "user-name" : "sa",
                    "valid-connection-checker-class-name" : null,
                    "valid-connection-checker-properties" : null,
                    "validate-on-match" : false,
                    "statistics" : {
                        "jdbc" : {
                            "PreparedStatementCacheAccessCount" : "0",
                            "PreparedStatementCacheAddCount" : "0",
                            "PreparedStatementCacheCurrentSize" : "0",
                            "PreparedStatementCacheDeleteCount" : "0",
                            "PreparedStatementCacheHitCount" : "0",
                            "PreparedStatementCacheMissCount" : "0"
                        },
                        "pool" : {
                            "ActiveCount" : "10",
                            "AvailableCount" : "20",
                            "AverageBlockingTime" : "1",
                            "AverageCreationTime" : "42",
                            "AverageGetTime" : "8",
                            "BlockingFailureCount" : "0",
                            "CreatedCount" : "10",
                            "DestroyedCount" : "0",
                            "IdleCount" : "10",
                            "InUseCount" : "0",
                            "MaxCreationTime" : "276",
                            "MaxGetTime" : "284",
                            "MaxUsedCount" : "10",
                            "MaxWaitCount" : "0",
                            "MaxWaitTime" : "1",
                            "TimedOut" : "0",
                            "TotalBlockingTime" : "12",
                            "TotalCreationTime" : "422",
                            "TotalGetTime" : "623",
                            "WaitCount" : "0"
                        }
                    }
                },
                "DerbyDS" : {
                    "allocation-retry" : null,
                    "allocation-retry-wait-millis" : null,
                    "allow-multiple-users" : false,
                    "background-validation" : null,
                    "background-validation-millis" : null,
                    "blocking-timeout-wait-millis" : null,
                    "capacity-decrementer-class" : null,
                    "capacity-decrementer-properties" : null,
                    "capacity-incrementer-class" : null,
                    "capacity-incrementer-properties" : null,
                    "check-valid-connection-sql" : null,
                    "connection-listener-class" : null,
                    "connection-listener-property" : null,
                    "connection-properties" : null,
                    "connection-url" : "jdbc:derby://localhost:1527/sun-appserv-samples",
                    "datasource-class" : null,
                    "driver-class" : null,
                    "driver-name" : "derby-client",
                    "enabled" : true,
                    "exception-sorter-class-name" : null,
                    "exception-sorter-properties" : null,
                    "flush-strategy" : null,
                    "idle-timeout-minutes" : null,
                    "initial-pool-size" : null,
                    "jndi-name" : "java:jboss/jdbc/derbyDS",
                    "jta" : true,
                    "max-pool-size" : null,
                    "min-pool-size" : null,
                    "new-connection-sql" : null,
                    "password" : "app",
                    "pool-prefill" : null,
                    "pool-use-strict-min" : null,
                    "prepared-statements-cache-size" : null,
                    "query-timeout" : null,
                    "reauth-plugin-class-name" : null,
                    "reauth-plugin-properties" : null,
                    "security-domain" : null,
                    "set-tx-query-timeout" : false,
                    "share-prepared-statements" : false,
                    "spy" : false,
                    "stale-connection-checker-class-name" : null,
                    "stale-connection-checker-properties" : null,
                    "track-statements" : "NOWARN",
                    "transaction-isolation" : null,
                    "url-delimiter" : null,
                    "url-selector-strategy-class-name" : null,
                    "use-ccm" : true,
                    "use-fast-fail" : false,
                    "use-java-context" : true,
                    "use-try-lock" : null,
                    "user-name" : "app",
                    "valid-connection-checker-class-name" : null,
                    "valid-connection-checker-properties" : null,
                    "validate-on-match" : false,
                    "statistics" : {
                        "jdbc" : {
                            "PreparedStatementCacheAccessCount" : "0",
                            "PreparedStatementCacheAddCount" : "0",
                            "PreparedStatementCacheCurrentSize" : "0",
                            "PreparedStatementCacheDeleteCount" : "0",
                            "PreparedStatementCacheHitCount" : "0",
                            "PreparedStatementCacheMissCount" : "0"
                        },
                        "pool" : {
                            "ActiveCount" : "0",
                            "AvailableCount" : "20",
                            "AverageBlockingTime" : "0",
                            "AverageCreationTime" : "0",
                            "AverageGetTime" : "0",
                            "BlockingFailureCount" : "0",
                            "CreatedCount" : "0",
                            "DestroyedCount" : "0",
                            "IdleCount" : "0",
                            "InUseCount" : "0",
                            "MaxCreationTime" : "0",
                            "MaxGetTime" : "0",
                            "MaxUsedCount" : "0",
                            "MaxWaitCount" : "0",
                            "MaxWaitTime" : "0",
                            "TimedOut" : "0",
                            "TotalBlockingTime" : "0",
                            "TotalCreationTime" : "0",
                            "TotalGetTime" : "0",
                            "WaitCount" : "0"
                        }
                    }
                }
            },
            "jdbc-driver" : {
                "h2" : {
                    "deployment-name" : null,
                    "driver-class-name" : null,
                    "driver-datasource-class-name" : null,
                    "driver-major-version" : null,
                    "driver-minor-version" : null,
                    "driver-module-name" : "com.h2database.h2",
                    "driver-name" : "h2",
                    "driver-xa-datasource-class-name" : "org.h2.jdbcx.JdbcDataSource",
                    "jdbc-compliant" : null,
                    "module-slot" : null,
                    "xa-datasource-class" : null
                },
                "derby-embedded" : {
                    "deployment-name" : null,
                    "driver-class-name" : "org.apache.derby.jdbc.EmbeddedDriver",
                    "driver-datasource-class-name" : "org.apache.derby.jdbc.EmbeddedDataSource",
                    "driver-major-version" : null,
                    "driver-minor-version" : null,
                    "driver-module-name" : "org.apache.derby",
                    "driver-name" : "derby-embedded",
                    "driver-xa-datasource-class-name" : "org.apache.derby.jdbc.EmbeddedXADataSource",
                    "jdbc-compliant" : null,
                    "module-slot" : null,
                    "xa-datasource-class" : null
                },
                "derby-client" : {
                    "deployment-name" : null,
                    "driver-class-name" : "org.apache.derby.jdbc.ClientDriver",
                    "driver-datasource-class-name" : "org.apache.derby.jdbc.ClientDataSource",
                    "driver-major-version" : null,
                    "driver-minor-version" : null,
                    "driver-module-name" : "org.apache.derbynet",
                    "driver-name" : "derby-client",
                    "driver-xa-datasource-class-name" : "org.apache.derby.jdbc.ClientXADataSource",
                    "jdbc-compliant" : null,
                    "module-slot" : null,
                    "xa-datasource-class" : null
                }
            },
            "xa-data-source" : null
        },
        "deployment-scanner" : {"scanner" : {"default" : {
            "auto-deploy-exploded" : false,
            "auto-deploy-xml" : true,
            "auto-deploy-zipped" : true,
            "deployment-timeout" : 600,
            "path" : "deployments",
            "relative-to" : "jboss.server.base.dir",
            "runtime-failure-causes-rollback" : false,
            "scan-enabled" : true,
            "scan-interval" : 5000
        }}},
        "ee" : {
            "annotation-property-replacement" : false,
            "ear-subdeployments-isolated" : false,
            "global-modules" : null,
            "jboss-descriptor-property-replacement" : true,
            "spec-descriptor-property-replacement" : false,
            "context-service" : {"default" : {
                "jndi-name" : "java:jboss/ee/concurrency/context/default",
                "use-transaction-setup-provider" : true
            }},
            "managed-executor-service" : {"default" : {
                "context-service" : "default",
                "core-threads" : 5,
                "hung-task-threshold" : 60000,
                "jndi-name" : "java:jboss/ee/concurrency/executor/default",
                "keepalive-time" : 5000,
                "long-running-tasks" : false,
                "max-threads" : 25,
                "queue-length" : 0,
                "reject-policy" : "ABORT",
                "thread-factory" : null
            }},
            "managed-scheduled-executor-service" : {"default" : {
                "context-service" : "default",
                "core-threads" : 2,
                "hung-task-threshold" : 60000,
                "jndi-name" : "java:jboss/ee/concurrency/scheduler/default",
                "keepalive-time" : 3000,
                "long-running-tasks" : false,
                "reject-policy" : "ABORT",
                "thread-factory" : null
            }},
            "managed-thread-factory" : {"default" : {
                "context-service" : "default",
                "jndi-name" : "java:jboss/ee/concurrency/factory/default",
                "priority" : 5
            }},
            "service" : {"default-bindings" : {
                "context-service" : "java:jboss/ee/concurrency/context/default",
                "datasource" : "java:jboss/datasources/ExampleDS",
                "jms-connection-factory" : "java:jboss/DefaultJMSConnectionFactory",
                "managed-executor-service" : "java:jboss/ee/concurrency/executor/default",
                "managed-scheduled-executor-service" : "java:jboss/ee/concurrency/scheduler/default",
                "managed-thread-factory" : "java:jboss/ee/concurrency/factory/default"
            }}
        },
        "ejb3" : {
            "default-clustered-sfsb-cache" : null,
            "default-distinct-name" : null,
            "default-entity-bean-instance-pool" : null,
            "default-entity-bean-optimistic-locking" : null,
            "default-mdb-instance-pool" : "mdb-strict-max-pool",
            "default-missing-method-permissions-deny-access" : true,
            "default-resource-adapter-name" : {
                "EXPRESSION_VALUE" : "${ejb.resource-adapter-name:hornetq-ra.rar}"
            },
            "default-security-domain" : "other",
            "default-sfsb-cache" : "simple",
            "default-sfsb-passivation-disabled-cache" : "simple",
            "default-singleton-bean-access-timeout" : 5000,
            "default-slsb-instance-pool" : null,
            "default-stateful-bean-access-timeout" : 5000,
            "disable-default-ejb-permissions" : false,
            "enable-statistics" : null,
            "in-vm-remote-interface-invocation-pass-by-value" : true,
            "cache" : {
                "simple" : {
                    "aliases" : null,
                    "passivation-store" : null
                },
                "distributable" : {
                    "aliases" : [
                        "passivating",
                        "clustered"
                    ],
                    "passivation-store" : "infinispan"
                }
            },
            "cluster-passivation-store" : null,
            "file-passivation-store" : null,
            "passivation-store" : {"infinispan" : {
                "bean-cache" : null,
                "cache-container" : "ejb",
                "max-size" : 10000
            }},
            "service" : {
                "async" : {"thread-pool-name" : "default"},
                "timer-service" : {
                    "default-data-store" : "default-file-store",
                    "thread-pool-name" : "default",
                    "database-data-store" : null,
                    "file-data-store" : {"default-file-store" : {
                        "path" : "timer-service-data",
                        "relative-to" : "jboss.server.data.dir"
                    }}
                },
                "remote" : {
                    "connector-ref" : "http-remoting-connector",
                    "thread-pool-name" : "default",
                    "channel-creation-options" : null
                },
                "iiop" : {
                    "enable-by-default" : false,
                    "use-qualified-name" : false
                }
            },
            "strict-max-bean-instance-pool" : {
                "slsb-strict-max-pool" : {
                    "max-pool-size" : 20,
                    "timeout" : 5,
                    "timeout-unit" : "MINUTES"
                },
                "mdb-strict-max-pool" : {
                    "max-pool-size" : 20,
                    "timeout" : 5,
                    "timeout-unit" : "MINUTES"
                }
            },
            "thread-pool" : {"default" : {
                "active-count" : 10,
                "completed-task-count" : 6711,
                "current-thread-count" : 10,
                "keepalive-time" : {
                    "time" : 100,
                    "unit" : "MILLISECONDS"
                },
                "largest-thread-count" : 10,
                "max-threads" : 10,
                "name" : "default",
                "queue-size" : 0,
                "rejected-count" : 0,
                "task-count" : 6721,
                "thread-factory" : null
            }}
        },
        "io" : {
            "buffer-pool" : {"default" : {
                "buffer-size" : null,
                "buffers-per-slice" : null,
                "direct-buffers" : null
            }},
            "worker" : {"default" : {
                "io-threads" : null,
                "stack-size" : 0,
                "task-core-threads" : 2,
                "task-keepalive" : 60,
                "task-max-threads" : null
            }}
        },
        "infinispan" : {"cache-container" : {
            "web" : {
                "aliases" : null,
                "cache-manager-status" : null,
                "cluster-name" : null,
                "coordinator-address" : null,
                "default-cache" : "passivation",
                "eviction-executor" : null,
                "is-coordinator" : null,
                "jndi-name" : null,
                "listener-executor" : null,
                "local-address" : null,
                "module" : "org.wildfly.clustering.web.infinispan",
                "replication-queue-executor" : null,
                "start" : null,
                "statistics-enabled" : null,
                "distributed-cache" : null,
                "invalidation-cache" : null,
                "local-cache" : {
                    "passivation" : {
                        "average-read-time" : null,
                        "average-write-time" : null,
                        "batching" : true,
                        "cache-status" : null,
                        "elapsed-time" : null,
                        "hit-ratio" : null,
                        "hits" : null,
                        "indexing" : null,
                        "indexing-properties" : null,
                        "invalidations" : null,
                        "jndi-name" : null,
                        "misses" : null,
                        "module" : null,
                        "number-of-entries" : null,
                        "passivations" : null,
                        "read-write-ratio" : null,
                        "remove-hits" : null,
                        "remove-misses" : null,
                        "start" : null,
                        "statistics-enabled" : null,
                        "stores" : null,
                        "time-since-reset" : null,
                        "binary-keyed-jdbc-store" : null,
                        "eviction" : null,
                        "expiration" : null,
                        "file-store" : {"FILE_STORE" : {
                            "cache-loader-loads" : null,
                            "cache-loader-misses" : null,
                            "fetch-state" : true,
                            "passivation" : true,
                            "path" : null,
                            "preload" : false,
                            "purge" : false,
                            "relative-to" : "jboss.server.data.dir",
                            "shared" : false,
                            "singleton" : false,
                            "property" : null,
                            "write-behind" : null
                        }},
                        "locking" : null,
                        "mixed-keyed-jdbc-store" : null,
                        "remote-store" : null,
                        "store" : null,
                        "string-keyed-jdbc-store" : null,
                        "transaction" : null
                    },
                    "persistent" : {
                        "average-read-time" : null,
                        "average-write-time" : null,
                        "batching" : true,
                        "cache-status" : null,
                        "elapsed-time" : null,
                        "hit-ratio" : null,
                        "hits" : null,
                        "indexing" : null,
                        "indexing-properties" : null,
                        "invalidations" : null,
                        "jndi-name" : null,
                        "misses" : null,
                        "module" : null,
                        "number-of-entries" : null,
                        "passivations" : null,
                        "read-write-ratio" : null,
                        "remove-hits" : null,
                        "remove-misses" : null,
                        "start" : null,
                        "statistics-enabled" : null,
                        "stores" : null,
                        "time-since-reset" : null,
                        "binary-keyed-jdbc-store" : null,
                        "eviction" : null,
                        "expiration" : null,
                        "file-store" : {"FILE_STORE" : {
                            "cache-loader-loads" : null,
                            "cache-loader-misses" : null,
                            "fetch-state" : true,
                            "passivation" : false,
                            "path" : null,
                            "preload" : false,
                            "purge" : false,
                            "relative-to" : "jboss.server.data.dir",
                            "shared" : false,
                            "singleton" : false,
                            "property" : null,
                            "write-behind" : null
                        }},
                        "locking" : null,
                        "mixed-keyed-jdbc-store" : null,
                        "remote-store" : null,
                        "store" : null,
                        "string-keyed-jdbc-store" : null,
                        "transaction" : null
                    }
                },
                "replicated-cache" : null,
                "transport" : null
            },
            "ejb" : {
                "aliases" : ["sfsb"],
                "cache-manager-status" : null,
                "cluster-name" : null,
                "coordinator-address" : null,
                "default-cache" : "passivation",
                "eviction-executor" : null,
                "is-coordinator" : null,
                "jndi-name" : null,
                "listener-executor" : null,
                "local-address" : null,
                "module" : "org.wildfly.clustering.ejb.infinispan",
                "replication-queue-executor" : null,
                "start" : null,
                "statistics-enabled" : null,
                "distributed-cache" : null,
                "invalidation-cache" : null,
                "local-cache" : {
                    "passivation" : {
                        "average-read-time" : null,
                        "average-write-time" : null,
                        "batching" : true,
                        "cache-status" : null,
                        "elapsed-time" : null,
                        "hit-ratio" : null,
                        "hits" : null,
                        "indexing" : null,
                        "indexing-properties" : null,
                        "invalidations" : null,
                        "jndi-name" : null,
                        "misses" : null,
                        "module" : null,
                        "number-of-entries" : null,
                        "passivations" : null,
                        "read-write-ratio" : null,
                        "remove-hits" : null,
                        "remove-misses" : null,
                        "start" : null,
                        "statistics-enabled" : null,
                        "stores" : null,
                        "time-since-reset" : null,
                        "binary-keyed-jdbc-store" : null,
                        "eviction" : null,
                        "expiration" : null,
                        "file-store" : {"FILE_STORE" : {
                            "cache-loader-loads" : null,
                            "cache-loader-misses" : null,
                            "fetch-state" : true,
                            "passivation" : true,
                            "path" : null,
                            "preload" : false,
                            "purge" : false,
                            "relative-to" : "jboss.server.data.dir",
                            "shared" : false,
                            "singleton" : false,
                            "property" : null,
                            "write-behind" : null
                        }},
                        "locking" : null,
                        "mixed-keyed-jdbc-store" : null,
                        "remote-store" : null,
                        "store" : null,
                        "string-keyed-jdbc-store" : null,
                        "transaction" : null
                    },
                    "persistent" : {
                        "average-read-time" : null,
                        "average-write-time" : null,
                        "batching" : true,
                        "cache-status" : null,
                        "elapsed-time" : null,
                        "hit-ratio" : null,
                        "hits" : null,
                        "indexing" : null,
                        "indexing-properties" : null,
                        "invalidations" : null,
                        "jndi-name" : null,
                        "misses" : null,
                        "module" : null,
                        "number-of-entries" : null,
                        "passivations" : null,
                        "read-write-ratio" : null,
                        "remove-hits" : null,
                        "remove-misses" : null,
                        "start" : null,
                        "statistics-enabled" : null,
                        "stores" : null,
                        "time-since-reset" : null,
                        "binary-keyed-jdbc-store" : null,
                        "eviction" : null,
                        "expiration" : null,
                        "file-store" : {"FILE_STORE" : {
                            "cache-loader-loads" : null,
                            "cache-loader-misses" : null,
                            "fetch-state" : true,
                            "passivation" : false,
                            "path" : null,
                            "preload" : false,
                            "purge" : false,
                            "relative-to" : "jboss.server.data.dir",
                            "shared" : false,
                            "singleton" : false,
                            "property" : null,
                            "write-behind" : null
                        }},
                        "locking" : null,
                        "mixed-keyed-jdbc-store" : null,
                        "remote-store" : null,
                        "store" : null,
                        "string-keyed-jdbc-store" : null,
                        "transaction" : null
                    }
                },
                "replicated-cache" : null,
                "transport" : null
            },
            "hibernate" : {
                "aliases" : null,
                "cache-manager-status" : null,
                "cluster-name" : null,
                "coordinator-address" : null,
                "default-cache" : "local-query",
                "eviction-executor" : null,
                "is-coordinator" : null,
                "jndi-name" : null,
                "listener-executor" : null,
                "local-address" : null,
                "module" : "org.hibernate",
                "replication-queue-executor" : null,
                "start" : null,
                "statistics-enabled" : null,
                "distributed-cache" : null,
                "invalidation-cache" : null,
                "local-cache" : {
                    "entity" : {
                        "average-read-time" : null,
                        "average-write-time" : null,
                        "batching" : null,
                        "cache-status" : null,
                        "elapsed-time" : null,
                        "hit-ratio" : null,
                        "hits" : null,
                        "indexing" : null,
                        "indexing-properties" : null,
                        "invalidations" : null,
                        "jndi-name" : null,
                        "misses" : null,
                        "module" : null,
                        "number-of-entries" : null,
                        "passivations" : null,
                        "read-write-ratio" : null,
                        "remove-hits" : null,
                        "remove-misses" : null,
                        "start" : null,
                        "statistics-enabled" : null,
                        "stores" : null,
                        "time-since-reset" : null,
                        "binary-keyed-jdbc-store" : null,
                        "eviction" : {"EVICTION" : {
                            "evictions" : null,
                            "max-entries" : 10000,
                            "strategy" : "LRU"
                        }},
                        "expiration" : {"EXPIRATION" : {
                            "interval" : 60000,
                            "lifespan" : -1,
                            "max-idle" : 100000
                        }},
                        "file-store" : null,
                        "locking" : null,
                        "mixed-keyed-jdbc-store" : null,
                        "remote-store" : null,
                        "store" : null,
                        "string-keyed-jdbc-store" : null,
                        "transaction" : {"TRANSACTION" : {
                            "commits" : null,
                            "locking" : "PESSIMISTIC",
                            "mode" : "NON_XA",
                            "prepares" : null,
                            "rollbacks" : null,
                            "stop-timeout" : 30000
                        }}
                    },
                    "local-query" : {
                        "average-read-time" : null,
                        "average-write-time" : null,
                        "batching" : null,
                        "cache-status" : null,
                        "elapsed-time" : null,
                        "hit-ratio" : null,
                        "hits" : null,
                        "indexing" : null,
                        "indexing-properties" : null,
                        "invalidations" : null,
                        "jndi-name" : null,
                        "misses" : null,
                        "module" : null,
                        "number-of-entries" : null,
                        "passivations" : null,
                        "read-write-ratio" : null,
                        "remove-hits" : null,
                        "remove-misses" : null,
                        "start" : null,
                        "statistics-enabled" : null,
                        "stores" : null,
                        "time-since-reset" : null,
                        "binary-keyed-jdbc-store" : null,
                        "eviction" : {"EVICTION" : {
                            "evictions" : null,
                            "max-entries" : 10000,
                            "strategy" : "LRU"
                        }},
                        "expiration" : {"EXPIRATION" : {
                            "interval" : 60000,
                            "lifespan" : -1,
                            "max-idle" : 100000
                        }},
                        "file-store" : null,
                        "locking" : null,
                        "mixed-keyed-jdbc-store" : null,
                        "remote-store" : null,
                        "store" : null,
                        "string-keyed-jdbc-store" : null,
                        "transaction" : {"TRANSACTION" : {
                            "commits" : null,
                            "locking" : "PESSIMISTIC",
                            "mode" : "NONE",
                            "prepares" : null,
                            "rollbacks" : null,
                            "stop-timeout" : 30000
                        }}
                    },
                    "timestamps" : {
                        "average-read-time" : null,
                        "average-write-time" : null,
                        "batching" : null,
                        "cache-status" : null,
                        "elapsed-time" : null,
                        "hit-ratio" : null,
                        "hits" : null,
                        "indexing" : null,
                        "indexing-properties" : null,
                        "invalidations" : null,
                        "jndi-name" : null,
                        "misses" : null,
                        "module" : null,
                        "number-of-entries" : null,
                        "passivations" : null,
                        "read-write-ratio" : null,
                        "remove-hits" : null,
                        "remove-misses" : null,
                        "start" : null,
                        "statistics-enabled" : null,
                        "stores" : null,
                        "time-since-reset" : null,
                        "binary-keyed-jdbc-store" : null,
                        "eviction" : {"EVICTION" : {
                            "evictions" : null,
                            "max-entries" : -1,
                            "strategy" : "NONE"
                        }},
                        "expiration" : null,
                        "file-store" : null,
                        "locking" : null,
                        "mixed-keyed-jdbc-store" : null,
                        "remote-store" : null,
                        "store" : null,
                        "string-keyed-jdbc-store" : null,
                        "transaction" : {"TRANSACTION" : {
                            "commits" : null,
                            "locking" : "PESSIMISTIC",
                            "mode" : "NONE",
                            "prepares" : null,
                            "rollbacks" : null,
                            "stop-timeout" : 30000
                        }}
                    }
                },
                "replicated-cache" : null,
                "transport" : null
            }
        }},
        "jacorb" : {
            "add-component-via-interceptor" : "on",
            "cache-poa-names" : "off",
            "cache-typecodes" : "off",
            "chunk-custom-rmi-valuetypes" : "on",
            "client-requires" : "None",
            "client-supports" : "MutualAuth",
            "client-timeout" : 0,
            "comet" : "off",
            "export-corbaloc" : "on",
            "giop-minor-version" : 2,
            "indirection-encoding-disable" : "off",
            "iona" : "off",
            "lax-boolean-encoding" : "off",
            "max-managed-buf-size" : 24,
            "max-server-connections" : 2147483647,
            "max-threads" : 32,
            "monitoring" : "off",
            "name" : "JBoss",
            "outbuf-cache-timeout" : -1,
            "outbuf-size" : 2048,
            "pool-size" : 5,
            "print-version" : "off",
            "properties" : null,
            "queue-max" : 100,
            "queue-min" : 10,
            "queue-wait" : "off",
            "retries" : 5,
            "retry-interval" : 500,
            "root-context" : "JBoss/Naming/root",
            "security" : "identity",
            "security-domain" : null,
            "server-requires" : "None",
            "server-supports" : "MutualAuth",
            "server-timeout" : 0,
            "socket-binding" : "jacorb",
            "ssl-socket-binding" : "jacorb-ssl",
            "strict-check-on-tc-creation" : "off",
            "sun" : "on",
            "support-ssl" : "off",
            "transactions" : "spec",
            "use-bom" : "off",
            "use-imr" : "off"
        },
        "jaxrs" : {},
        "jca" : {
            "archive-validation" : {"archive-validation" : {
                "enabled" : true,
                "fail-on-error" : true,
                "fail-on-warn" : false
            }},
            "bean-validation" : {"bean-validation" : {"enabled" : true}},
            "bootstrap-context" : {"default" : {
                "name" : "default",
                "workmanager" : "default"
            }},
            "cached-connection-manager" : {"cached-connection-manager" : {
                "debug" : false,
                "error" : false,
                "ignore-unknown-connections" : false,
                "install" : true
            }},
            "distributed-workmanager" : null,
            "workmanager" : {"default" : {
                "name" : "default",
                "long-running-threads" : {"default" : {
                    "allow-core-timeout" : false,
                    "core-threads" : 50,
                    "current-thread-count" : 0,
                    "handoff-executor" : null,
                    "keepalive-time" : {
                        "time" : 10,
                        "unit" : "SECONDS"
                    },
                    "largest-thread-count" : 0,
                    "max-threads" : 50,
                    "name" : "default",
                    "queue-length" : 50,
                    "queue-size" : 0,
                    "rejected-count" : 0,
                    "thread-factory" : null
                }},
                "short-running-threads" : {"default" : {
                    "allow-core-timeout" : false,
                    "core-threads" : 50,
                    "current-thread-count" : 0,
                    "handoff-executor" : null,
                    "keepalive-time" : {
                        "time" : 10,
                        "unit" : "SECONDS"
                    },
                    "largest-thread-count" : 0,
                    "max-threads" : 50,
                    "name" : "default",
                    "queue-length" : 50,
                    "queue-size" : 0,
                    "rejected-count" : 0,
                    "thread-factory" : null
                }}
            }}
        },
        "jdr" : {},
        "jmx" : {
            "non-core-mbean-sensitivity" : false,
            "configuration" : null,
            "expose-model" : {
                "resolved" : {
                    "domain-name" : "jboss.as",
                    "proper-property-format" : true
                },
                "expression" : {"domain-name" : "jboss.as.expr"}
            },
            "remoting-connector" : {"jmx" : {"use-management-endpoint" : true}}
        },
        "jpa" : {
            "default-datasource" : "",
            "default-extended-persistence-inheritance" : "DEEP"
        },
        "jsf" : {"default-jsf-impl-slot" : "main"},
        "jsr77" : {},
        "mail" : {"mail-session" : {"default" : {
            "debug" : false,
            "from" : null,
            "jndi-name" : "java:jboss/mail/Default",
            "custom" : null,
            "server" : {"smtp" : {
                "outbound-socket-binding-ref" : "mail-smtp",
                "password" : null,
                "ssl" : false,
                "tls" : false,
                "username" : null
            }}
        }}},
        "messaging" : {
            "hornetq-server" : {"default" : {
                "active" : true,
                "allow-failback" : true,
                "async-connection-execution-enabled" : true,
                "backup" : false,
                "backup-group-name" : null,
                "check-for-live-server" : false,
                "cluster-password" : "CHANGE ME!!",
                "cluster-user" : "HORNETQ.CLUSTER.ADMIN.USER",
                "clustered" : false,
                "connection-ttl-override" : -1,
                "create-bindings-dir" : true,
                "create-journal-dir" : true,
                "failback-delay" : 5000,
                "failover-on-shutdown" : false,
                "id-cache-size" : 20000,
                "jmx-domain" : "org.hornetq",
                "jmx-management-enabled" : false,
                "journal-buffer-size" : null,
                "journal-buffer-timeout" : null,
                "journal-compact-min-files" : 10,
                "journal-compact-percentage" : 30,
                "journal-file-size" : 102400,
                "journal-max-io" : null,
                "journal-min-files" : 2,
                "journal-sync-non-transactional" : true,
                "journal-sync-transactional" : true,
                "journal-type" : "ASYNCIO",
                "live-connector-ref" : null,
                "log-journal-write-rate" : false,
                "management-address" : "jms.queue.hornetq.management",
                "management-notification-address" : "hornetq.notifications",
                "max-saved-replicated-journal-size" : 2,
                "memory-measure-interval" : -1,
                "memory-warning-threshold" : 25,
                "message-counter-enabled" : false,
                "message-counter-max-day-history" : 10,
                "message-counter-sample-period" : 10000,
                "message-expiry-scan-period" : 30000,
                "message-expiry-thread-priority" : 3,
                "page-max-concurrent-io" : 5,
                "perf-blast-pages" : -1,
                "persist-delivery-count-before-delivery" : false,
                "persist-id-cache" : true,
                "persistence-enabled" : true,
                "remoting-incoming-interceptors" : null,
                "remoting-interceptors" : null,
                "remoting-outgoing-interceptors" : null,
                "replication-clustername" : null,
                "run-sync-speed-test" : false,
                "scheduled-thread-pool-max-size" : 5,
                "security-domain" : "other",
                "security-enabled" : true,
                "security-invalidation-interval" : 10000,
                "server-dump-interval" : -1,
                "shared-store" : true,
                "started" : true,
                "statistics-enabled" : false,
                "thread-pool-max-size" : 30,
                "transaction-timeout" : 300000,
                "transaction-timeout-scan-period" : 1000,
                "version" : "2.4.5.FINAL (Wild Hornet, 124)",
                "wild-card-routing-enabled" : true,
                "acceptor" : null,
                "address-setting" : {"#" : {
                    "address-full-policy" : "PAGE",
                    "dead-letter-address" : "jms.queue.DLQ",
                    "expiry-address" : "jms.queue.ExpiryQueue",
                    "expiry-delay" : -1,
                    "last-value-queue" : false,
                    "max-delivery-attempts" : 10,
                    "max-size-bytes" : 10485760,
                    "message-counter-history-day-limit" : 10,
                    "page-max-cache-size" : 5,
                    "page-size-bytes" : 2097152,
                    "redelivery-delay" : 0,
                    "redistribution-delay" : -1,
                    "send-to-dla-on-no-route" : false
                }},
                "bridge" : null,
                "broadcast-group" : null,
                "cluster-connection" : null,
                "connection-factory" : {
                    "InVmConnectionFactory" : {
                        "auto-group" : false,
                        "block-on-acknowledge" : false,
                        "block-on-durable-send" : true,
                        "block-on-non-durable-send" : false,
                        "cache-large-message-client" : false,
                        "call-failover-timeout" : -1,
                        "call-timeout" : 30000,
                        "client-failure-check-period" : 30000,
                        "client-id" : null,
                        "compress-large-messages" : false,
                        "confirmation-window-size" : -1,
                        "connection-load-balancing-policy-class-name" : "org.hornetq.api.core.client.loadbalance.RoundRobinConnectionLoadBalancingPolicy",
                        "connection-ttl" : 60000,
                        "connector" : {"in-vm" : null},
                        "consumer-max-rate" : -1,
                        "consumer-window-size" : 1048576,
                        "discovery-group-name" : null,
                        "discovery-initial-wait-timeout" : null,
                        "dups-ok-batch-size" : 1048576,
                        "entries" : ["java:/ConnectionFactory"],
                        "factory-type" : "GENERIC",
                        "failover-on-initial-connection" : false,
                        "failover-on-server-shutdown" : null,
                        "group-id" : null,
                        "ha" : false,
                        "initial-message-packet-size" : 1500,
                        "max-retry-interval" : 2000,
                        "min-large-message-size" : 102400,
                        "pre-acknowledge" : false,
                        "producer-max-rate" : -1,
                        "producer-window-size" : 65536,
                        "reconnect-attempts" : 0,
                        "retry-interval" : 2000,
                        "retry-interval-multiplier" : 1.0,
                        "scheduled-thread-pool-max-size" : 5,
                        "thread-pool-max-size" : 30,
                        "transaction-batch-size" : 1048576,
                        "use-global-pools" : true
                    },
                    "RemoteConnectionFactory" : {
                        "auto-group" : false,
                        "block-on-acknowledge" : false,
                        "block-on-durable-send" : true,
                        "block-on-non-durable-send" : false,
                        "cache-large-message-client" : false,
                        "call-failover-timeout" : -1,
                        "call-timeout" : 30000,
                        "client-failure-check-period" : 30000,
                        "client-id" : null,
                        "compress-large-messages" : false,
                        "confirmation-window-size" : -1,
                        "connection-load-balancing-policy-class-name" : "org.hornetq.api.core.client.loadbalance.RoundRobinConnectionLoadBalancingPolicy",
                        "connection-ttl" : 60000,
                        "connector" : {"http-connector" : null},
                        "consumer-max-rate" : -1,
                        "consumer-window-size" : 1048576,
                        "discovery-group-name" : null,
                        "discovery-initial-wait-timeout" : null,
                        "dups-ok-batch-size" : 1048576,
                        "entries" : ["java:jboss/exported/jms/RemoteConnectionFactory"],
                        "factory-type" : "GENERIC",
                        "failover-on-initial-connection" : false,
                        "failover-on-server-shutdown" : null,
                        "group-id" : null,
                        "ha" : false,
                        "initial-message-packet-size" : 1500,
                        "max-retry-interval" : 2000,
                        "min-large-message-size" : 102400,
                        "pre-acknowledge" : false,
                        "producer-max-rate" : -1,
                        "producer-window-size" : 65536,
                        "reconnect-attempts" : 0,
                        "retry-interval" : 2000,
                        "retry-interval-multiplier" : 1.0,
                        "scheduled-thread-pool-max-size" : 5,
                        "thread-pool-max-size" : 30,
                        "transaction-batch-size" : 1048576,
                        "use-global-pools" : true
                    }
                },
                "connector" : null,
                "connector-service" : null,
                "core-address" : {
                    "jms.queue.ExpiryQueue" : {
                        "binding-names" : ["jms.queue.ExpiryQueue"],
                        "number-of-bytes-per-page" : 2097152,
                        "number-of-pages" : 0,
                        "queue-names" : ["jms.queue.ExpiryQueue"],
                        "roles" : [{
                            "create-durable-queue" : false,
                            "create-non-durable-queue" : true,
                            "name" : "guest",
                            "delete-non-durable-queue" : true,
                            "consume" : true,
                            "send" : true,
                            "delete-durable-queue" : false,
                            "manage" : false
                        }],
                        "role" : {"guest" : {
                            "consume" : true,
                            "create-durable-queue" : false,
                            "create-non-durable-queue" : true,
                            "delete-durable-queue" : false,
                            "delete-non-durable-queue" : true,
                            "manage" : false,
                            "send" : true
                        }}
                    },
                    "jms.queue.DLQ" : {
                        "binding-names" : ["jms.queue.DLQ"],
                        "number-of-bytes-per-page" : 2097152,
                        "number-of-pages" : 0,
                        "queue-names" : ["jms.queue.DLQ"],
                        "roles" : [{
                            "create-durable-queue" : false,
                            "create-non-durable-queue" : true,
                            "name" : "guest",
                            "delete-non-durable-queue" : true,
                            "consume" : true,
                            "send" : true,
                            "delete-durable-queue" : false,
                            "manage" : false
                        }],
                        "role" : {"guest" : {
                            "consume" : true,
                            "create-durable-queue" : false,
                            "create-non-durable-queue" : true,
                            "delete-durable-queue" : false,
                            "delete-non-durable-queue" : true,
                            "manage" : false,
                            "send" : true
                        }}
                    }
                },
                "discovery-group" : null,
                "divert" : null,
                "grouping-handler" : null,
                "http-acceptor" : {
                    "http-acceptor" : {
                        "http-listener" : "default",
                        "param" : null
                    },
                    "http-acceptor-throughput" : {
                        "http-listener" : "default",
                        "param" : {
                            "batch-delay" : {"value" : "50"},
                            "direct-deliver" : {"value" : "false"}
                        }
                    }
                },
                "http-connector" : {
                    "http-connector" : {
                        "socket-binding" : "http",
                        "param" : {"http-upgrade-endpoint" : {"value" : "http-acceptor"}}
                    },
                    "http-connector-throughput" : {
                        "socket-binding" : "http",
                        "param" : {
                            "http-upgrade-endpoint" : {"value" : "http-acceptor-throughput"},
                            "batch-delay" : {"value" : "50"}
                        }
                    }
                },
                "in-vm-acceptor" : {"in-vm" : {
                    "server-id" : 0,
                    "started" : true,
                    "param" : null
                }},
                "in-vm-connector" : {"in-vm" : {
                    "server-id" : 0,
                    "param" : null
                }},
                "jms-queue" : {
                    "ExpiryQueue" : {
                        "consumer-count" : 0,
                        "dead-letter-address" : "jms.queue.DLQ",
                        "delivering-count" : 0,
                        "durable" : true,
                        "entries" : ["java:/jms/queue/ExpiryQueue"],
                        "expiry-address" : "jms.queue.ExpiryQueue",
                        "message-count" : 0,
                        "messages-added" : 0,
                        "paused" : false,
                        "queue-address" : "jms.queue.ExpiryQueue",
                        "scheduled-count" : 0,
                        "selector" : null,
                        "temporary" : false
                    },
                    "DLQ" : {
                        "consumer-count" : 0,
                        "dead-letter-address" : "jms.queue.DLQ",
                        "delivering-count" : 0,
                        "durable" : true,
                        "entries" : ["java:/jms/queue/DLQ"],
                        "expiry-address" : "jms.queue.ExpiryQueue",
                        "message-count" : 0,
                        "messages-added" : 0,
                        "paused" : false,
                        "queue-address" : "jms.queue.DLQ",
                        "scheduled-count" : 0,
                        "selector" : null,
                        "temporary" : false
                    }
                },
                "jms-topic" : null,
                "path" : {
                    "large-messages-directory" : {
                        "path" : "messaginglargemessages",
                        "relative-to" : "jboss.server.data.dir"
                    },
                    "bindings-directory" : {
                        "path" : "messagingbindings",
                        "relative-to" : "jboss.server.data.dir"
                    },
                    "journal-directory" : {
                        "path" : "messagingjournal",
                        "relative-to" : "jboss.server.data.dir"
                    },
                    "paging-directory" : {
                        "path" : "messagingpaging",
                        "relative-to" : "jboss.server.data.dir"
                    }
                },
                "pooled-connection-factory" : {"hornetq-ra" : {
                    "auto-group" : false,
                    "block-on-acknowledge" : false,
                    "block-on-durable-send" : true,
                    "block-on-non-durable-send" : false,
                    "cache-large-message-client" : false,
                    "call-failover-timeout" : -1,
                    "call-timeout" : 30000,
                    "client-failure-check-period" : 30000,
                    "client-id" : null,
                    "compress-large-messages" : false,
                    "confirmation-window-size" : -1,
                    "connection-load-balancing-policy-class-name" : "org.hornetq.api.core.client.loadbalance.RoundRobinConnectionLoadBalancingPolicy",
                    "connection-ttl" : 60000,
                    "connector" : {"in-vm" : null},
                    "consumer-max-rate" : -1,
                    "consumer-window-size" : 1048576,
                    "discovery-group-name" : null,
                    "discovery-initial-wait-timeout" : null,
                    "dups-ok-batch-size" : 1048576,
                    "entries" : [
                        "java:/JmsXA",
                        "java:jboss/DefaultJMSConnectionFactory"
                    ],
                    "failover-on-initial-connection" : false,
                    "failover-on-server-shutdown" : null,
                    "group-id" : null,
                    "ha" : false,
                    "initial-connect-attempts" : 1,
                    "initial-message-packet-size" : 1500,
                    "jndi-params" : null,
                    "max-pool-size" : -1,
                    "max-retry-interval" : 2000,
                    "min-large-message-size" : 102400,
                    "min-pool-size" : -1,
                    "password" : null,
                    "pre-acknowledge" : false,
                    "producer-max-rate" : -1,
                    "producer-window-size" : 65536,
                    "reconnect-attempts" : -1,
                    "retry-interval" : 2000,
                    "retry-interval-multiplier" : 1.0,
                    "scheduled-thread-pool-max-size" : 5,
                    "setup-attempts" : null,
                    "setup-interval" : null,
                    "thread-pool-max-size" : 30,
                    "transaction" : "xa",
                    "transaction-batch-size" : 1048576,
                    "use-auto-recovery" : true,
                    "use-global-pools" : true,
                    "use-jndi" : null,
                    "use-local-tx" : null,
                    "user" : null
                }},
                "queue" : null,
                "remote-acceptor" : null,
                "remote-connector" : null,
                "runtime-queue" : {
                    "jms.queue.ExpiryQueue" : {
                        "consumer-count" : 0,
                        "dead-letter-address" : "jms.queue.DLQ",
                        "delivering-count" : 0,
                        "durable" : true,
                        "expiry-address" : "jms.queue.ExpiryQueue",
                        "filter" : null,
                        "id" : 7,
                        "message-count" : 0,
                        "messages-added" : 0,
                        "paused" : false,
                        "queue-address" : "jms.queue.ExpiryQueue",
                        "scheduled-count" : 0,
                        "temporary" : false
                    },
                    "jms.queue.DLQ" : {
                        "consumer-count" : 0,
                        "dead-letter-address" : "jms.queue.DLQ",
                        "delivering-count" : 0,
                        "durable" : true,
                        "expiry-address" : "jms.queue.ExpiryQueue",
                        "filter" : null,
                        "id" : 3,
                        "message-count" : 0,
                        "messages-added" : 0,
                        "paused" : false,
                        "queue-address" : "jms.queue.DLQ",
                        "scheduled-count" : 0,
                        "temporary" : false
                    }
                },
                "security-setting" : {"#" : {"role" : {"guest" : {
                    "consume" : true,
                    "create-durable-queue" : false,
                    "create-non-durable-queue" : true,
                    "delete-durable-queue" : false,
                    "delete-non-durable-queue" : true,
                    "manage" : false,
                    "send" : true
                }}}}
            }},
            "jms-bridge" : null
        },
        "naming" : {
            "binding" : null,
            "service" : {"remote-naming" : {}}
        },
        "pojo" : {},
        "remoting" : {
            "worker-read-threads" : 1,
            "worker-task-core-threads" : 4,
            "worker-task-keepalive" : 60,
            "worker-task-limit" : 16384,
            "worker-task-max-threads" : 16,
            "worker-write-threads" : 1,
            "configuration" : {"endpoint" : {
                "auth-realm" : null,
                "authentication-retries" : 3,
                "authorize-id" : null,
                "buffer-region-size" : null,
                "heartbeat-interval" : 2147483647,
                "max-inbound-channels" : 40,
                "max-inbound-message-size" : 9223372036854775807,
                "max-inbound-messages" : 80,
                "max-outbound-channels" : 40,
                "max-outbound-message-size" : 9223372036854775807,
                "max-outbound-messages" : 65535,
                "receive-buffer-size" : 8192,
                "receive-window-size" : 131072,
                "sasl-protocol" : "remoting",
                "send-buffer-size" : 8192,
                "server-name" : null,
                "transmit-window-size" : 131072,
                "worker" : "default"
            }},
            "connector" : null,
            "http-connector" : {"http-remoting-connector" : {
                "authentication-provider" : null,
                "connector-ref" : "default",
                "security-realm" : "ApplicationRealm",
                "property" : null,
                "security" : null
            }},
            "local-outbound-connection" : null,
            "outbound-connection" : null,
            "remote-outbound-connection" : null
        },
        "resource-adapters" : {"resource-adapter" : null},
        "sar" : {},
        "security" : {
            "deep-copy-subject-mode" : false,
            "security-domain" : {
                "other" : {
                    "cache-type" : "default",
                    "acl" : null,
                    "audit" : null,
                    "authentication" : {"classic" : {
                        "login-modules" : [
                            {
                                "code" : "Remoting",
                                "flag" : "optional",
                                "module" : null,
                                "module-options" : {"password-stacking" : "useFirstPass"}
                            },
                            {
                                "code" : "RealmDirect",
                                "flag" : "required",
                                "module" : null,
                                "module-options" : {"password-stacking" : "useFirstPass"}
                            }
                        ],
                        "login-module" : {
                            "Remoting" : {
                                "code" : "Remoting",
                                "flag" : "optional",
                                "module" : null,
                                "module-options" : {"password-stacking" : "useFirstPass"}
                            },
                            "RealmDirect" : {
                                "code" : "RealmDirect",
                                "flag" : "required",
                                "module" : null,
                                "module-options" : {"password-stacking" : "useFirstPass"}
                            }
                        }
                    }},
                    "authorization" : null,
                    "identity-trust" : null,
                    "jsse" : null,
                    "mapping" : null
                },
                "jboss-web-policy" : {
                    "cache-type" : "default",
                    "acl" : null,
                    "audit" : null,
                    "authentication" : null,
                    "authorization" : {"classic" : {
                        "policy-modules" : [{
                            "code" : "Delegating",
                            "flag" : "required",
                            "module" : null,
                            "module-options" : null
                        }],
                        "policy-module" : {"Delegating" : {
                            "code" : "Delegating",
                            "flag" : "required",
                            "module" : null,
                            "module-options" : null
                        }}
                    }},
                    "identity-trust" : null,
                    "jsse" : null,
                    "mapping" : null
                },
                "jboss-ejb-policy" : {
                    "cache-type" : "default",
                    "acl" : null,
                    "audit" : null,
                    "authentication" : null,
                    "authorization" : {"classic" : {
                        "policy-modules" : [{
                            "code" : "Delegating",
                            "flag" : "required",
                            "module" : null,
                            "module-options" : null
                        }],
                        "policy-module" : {"Delegating" : {
                            "code" : "Delegating",
                            "flag" : "required",
                            "module" : null,
                            "module-options" : null
                        }}
                    }},
                    "identity-trust" : null,
                    "jsse" : null,
                    "mapping" : null
                }
            },
            "vault" : null
        },
        "transactions" : {
            "default-timeout" : 300,
            "enable-statistics" : false,
            "enable-tsm-status" : false,
            "hornetq-store-enable-async-io" : false,
            "jdbc-action-store-drop-table" : false,
            "jdbc-action-store-table-prefix" : null,
            "jdbc-communication-store-drop-table" : false,
            "jdbc-communication-store-table-prefix" : null,
            "jdbc-state-store-drop-table" : false,
            "jdbc-state-store-table-prefix" : null,
            "jdbc-store-datasource" : null,
            "jts" : false,
            "node-identifier" : "1",
            "number-of-aborted-transactions" : 0,
            "number-of-application-rollbacks" : 0,
            "number-of-committed-transactions" : 0,
            "number-of-heuristics" : 0,
            "number-of-inflight-transactions" : 0,
            "number-of-nested-transactions" : 0,
            "number-of-resource-rollbacks" : 0,
            "number-of-timed-out-transactions" : 0,
            "number-of-transactions" : 0,
            "object-store-path" : "tx-object-store",
            "object-store-relative-to" : "jboss.server.data.dir",
            "path" : "var",
            "process-id-socket-binding" : null,
            "process-id-socket-max-ports" : 10,
            "process-id-uuid" : true,
            "recovery-listener" : false,
            "relative-to" : "jboss.server.data.dir",
            "socket-binding" : "txn-recovery-environment",
            "statistics-enabled" : false,
            "status-socket-binding" : "txn-status-manager",
            "use-hornetq-store" : false,
            "use-jdbc-store" : false,
            "log-store" : {"log-store" : {
                "type" : "default",
                "transactions" : null
            }}
        },
        "undertow" : {
            "default-server" : "default-server",
            "default-servlet-container" : "default",
            "default-virtual-host" : "default-host",
            "instance-id" : {
                "EXPRESSION_VALUE" : "${jboss.node.name}"
            },
            "statistics-enabled" : false,
            "buffer-cache" : {"default" : {
                "buffer-size" : 1024,
                "buffers-per-region" : 1024,
                "max-regions" : 10
            }},
            "configuration" : {
                "filter" : {
                    "basic-auth" : null,
                    "connection-limit" : null,
                    "custom-filter" : null,
                    "error-page" : null,
                    "gzip" : null,
                    "response-header" : {
                        "server-header" : {
                            "header-name" : "Server",
                            "header-value" : "WildFly/8"
                        },
                        "x-powered-by-header" : {
                            "header-name" : "X-Powered-By",
                            "header-value" : "Undertow/1"
                        }
                    }
                },
                "handler" : {
                    "file" : {"welcome-content" : {
                        "cache-buffer-size" : 1024,
                        "cache-buffers" : 1024,
                        "directory-listing" : false,
                        "path" : {
                            "EXPRESSION_VALUE" : "${jboss.home.dir}/welcome-content"
                        }
                    }},
                    "reverse-proxy" : null
                }
            },
            "server" : {"default-server" : {
                "default-host" : "default-host",
                "servlet-container" : "default",
                "ajp-listener" : null,
                "host" : {"default-host" : {
                    "alias" : ["localhost"],
                    "default-web-module" : "ROOT.war",
                    "filter-ref" : {
                        "server-header" : {
                            "predicate" : null,
                            "priority" : 1
                        },
                        "x-powered-by-header" : {
                            "predicate" : null,
                            "priority" : 1
                        }
                    },
                    "location" : {"/" : {
                        "handler" : "welcome-content",
                        "filter-ref" : null
                    }},
                    "setting" : {"access-log" : {
                        "directory" : {
                            "EXPRESSION_VALUE" : "${jboss.home.dir}/standalone/log"
                        },
                        "pattern" : "common",
                        "prefix" : "access",
                        "rotate" : true,
                        "suffix" : ".log",
                        "worker" : "default"
                    }}
                }},
                "http-listener" : {"default" : {
                    "allow-encoded-slash" : false,
                    "allow-equals-in-cookie-value" : false,
                    "always-set-keep-alive" : true,
                    "buffer-pipelined-data" : true,
                    "buffer-pool" : "default",
                    "certificate-forwarding" : false,
                    "decode-url" : true,
                    "enabled" : true,
                    "max-buffered-request-size" : 16384,
                    "max-cookies" : 200,
                    "max-header-size" : 51200,
                    "max-headers" : 200,
                    "max-parameters" : 1000,
                    "max-post-size" : 10485760,
                    "no-request-timeout" : -1,
                    "proxy-address-forwarding" : false,
                    "read-timeout" : null,
                    "receive-buffer" : null,
                    "record-request-start-time" : false,
                    "redirect-socket" : "https",
                    "request-parse-timeout" : -1,
                    "resolve-peer-address" : false,
                    "send-buffer" : null,
                    "socket-binding" : "http",
                    "tcp-backlog" : null,
                    "tcp-keep-alive" : null,
                    "url-charset" : "UTF-8",
                    "worker" : "default",
                    "write-timeout" : null
                }},
                "https-listener" : {"https" : {
                    "allow-encoded-slash" : false,
                    "allow-equals-in-cookie-value" : false,
                    "always-set-keep-alive" : true,
                    "buffer-pipelined-data" : true,
                    "buffer-pool" : "default",
                    "decode-url" : true,
                    "enabled" : true,
                    "enabled-cipher-suites" : null,
                    "enabled-protocols" : null,
                    "max-buffered-request-size" : 16384,
                    "max-cookies" : 200,
                    "max-header-size" : 51200,
                    "max-headers" : 200,
                    "max-parameters" : 1000,
                    "max-post-size" : 10485760,
                    "no-request-timeout" : -1,
                    "read-timeout" : null,
                    "receive-buffer" : null,
                    "record-request-start-time" : false,
                    "request-parse-timeout" : -1,
                    "resolve-peer-address" : false,
                    "security-realm" : "UndertowRealm",
                    "send-buffer" : null,
                    "socket-binding" : "https",
                    "tcp-backlog" : null,
                    "tcp-keep-alive" : null,
                    "url-charset" : "UTF-8",
                    "verify-client" : "NOT_REQUESTED",
                    "worker" : "default",
                    "write-timeout" : null
                }}
            }},
            "servlet-container" : {"default" : {
                "allow-non-standard-wrappers" : false,
                "default-buffer-cache" : "default",
                "default-encoding" : null,
                "default-session-timeout" : 30,
                "disable-caching-for-secured-pages" : true,
                "eager-filter-initialization" : false,
                "ignore-flush" : false,
                "stack-trace-on-error" : "local-only",
                "use-listener-encoding" : false,
                "setting" : {
                    "jsp" : {
                        "check-interval" : 0,
                        "development" : false,
                        "disabled" : false,
                        "display-source-fragment" : true,
                        "dump-smap" : false,
                        "error-on-use-bean-invalid-class-attribute" : false,
                        "generate-strings-as-char-arrays" : false,
                        "java-encoding" : "UTF8",
                        "keep-generated" : true,
                        "mapped-file" : true,
                        "modification-test-interval" : 4,
                        "recompile-on-fail" : false,
                        "scratch-dir" : null,
                        "smap" : true,
                        "source-vm" : "1.7",
                        "tag-pooling" : true,
                        "target-vm" : "1.7",
                        "trim-spaces" : false,
                        "x-powered-by" : true
                    },
                    "websockets" : {
                        "buffer-pool" : "default",
                        "dispatch-to-worker" : true,
                        "worker" : "default"
                    }
                }
            }}
        },
        "webservices" : {
            "modify-wsdl-address" : true,
            "wsdl-host" : {
                "EXPRESSION_VALUE" : "${jboss.bind.address:127.0.0.1}"
            },
            "wsdl-port" : null,
            "wsdl-secure-port" : null,
            "client-config" : {"Standard-Client-Config" : {
                "post-handler-chain" : null,
                "pre-handler-chain" : null,
                "property" : null
            }},
            "endpoint-config" : {
                "Standard-Endpoint-Config" : {
                    "post-handler-chain" : null,
                    "pre-handler-chain" : null,
                    "property" : null
                },
                "Recording-Endpoint-Config" : {
                    "post-handler-chain" : null,
                    "pre-handler-chain" : {"recording-handlers" : {
                        "protocol-bindings" : "##SOAP11_HTTP ##SOAP11_HTTP_MTOM ##SOAP12_HTTP ##SOAP12_HTTP_MTOM",
                        "handler" : {"RecordingHandler" : {"class" : "org.jboss.ws.common.invocation.RecordingServerHandler"}}
                    }},
                    "property" : null
                }
            }
        },
        "weld" : {
            "non-portable-mode" : false,
            "require-bean-descriptor" : false
        }
    },
    "system-property" : null
}