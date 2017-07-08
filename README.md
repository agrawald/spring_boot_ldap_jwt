# spring-boot-security-ldap-jwt 

Application to authenticate and authorize REST requests using LDAP (embedded) and JWT.

This application will validate the login request with LDAP and return a JWT token which will be used for authorizing all the further request.

# frameworks

 * spring-boot-starter-web
 * spring-boot-starter-security
 * spring-boot-starter-data-jpa
 * spring-ldap-core
 * spring-security-ldap
 * spring-tx
 * unboundid-ldapsdk
 * jjwt
 
# testing

 - Postman
 
# future-enhancements

 - Adding role based authentication
 - Fetching roles from the database
 - Configuration for disabling embedded ldap for production
