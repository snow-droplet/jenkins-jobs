pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/snow-droplet/vinlookup-service.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}