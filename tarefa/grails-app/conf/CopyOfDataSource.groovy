dataSource {
    pooled = true
       driverClassName = "com.mysql.jdbc.Driver"
       username = "root"
       password = "adm"
       dialect = org.hibernate.dialect.MySQL5InnoDBDialect
       properties {
          maxActive = 50
          maxIdle = 25
          minIdle = 5
          initialSize = 5
          minEvictableIdleTimeMillis = 1800000
          timeBetweenEvictionRunsMillis = 1800000
          maxWait = 10000
          ValidationQuery = 'select 1'
       }
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://localhost/tarefa?useOldAliasMetadataBehavior=true"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/tarefa?useOldAliasMetadataBehavior=true"
        }
    }
    production {
        dataSource {
           
        }
    }
}