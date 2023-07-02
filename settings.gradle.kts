rootProject.name = "pinda-authority"
include("pd-core")
include("pd-gateway")
include("pd-auth")
include("pd-auth:auth-api")
findProject(":pd-auth:auth-api")?.name = "auth-api"
include("pd-auth:auth-service")
findProject(":pd-auth:auth-service")?.name = "auth-service"
