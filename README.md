# Banking WAR Lab

A beginner Maven project with **exactly three Java source files** and **one dependency** (`jakarta.servlet-api`, scope `provided`). It builds `target/banking.war` for Tomcat 10.1.x with JDK 17.

## Java files

1. `Account.java` - holds demo account details.
2. `BankingService.java` - returns an example account.
3. `BankingServlet.java` - exposes `/account` as a web endpoint.

## EC2 hands-on

```bash
java -version
mvn -version
mvn clean package
ls -lh target/banking.war
```

Once pushed to your GitHub repository, clone it on EC2 with `git clone <your-repository-URL>`, enter the project directory, then run the Maven commands above.

To deploy on your Tomcat 10.1 server, copy `target/banking.war` into that server's `webapps/` directory (adjust the path for your installation), and verify the server has deployed it. Then visit:

- `http://<EC2-IP>:8080/banking/`
- `http://<EC2-IP>:8080/banking/account`

Use an ALB or reverse proxy and appropriate security-group rules in a real environment. This is a demonstration with hardcoded account information; it has no database, authentication, or real customer data.
