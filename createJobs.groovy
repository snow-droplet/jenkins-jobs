pipelineJob('vinlookup-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'git@github.com:snow-droplet/vinlookup-service.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}