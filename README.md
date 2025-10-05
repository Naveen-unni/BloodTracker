# BloodTracker Project - Quick Local Setup

```bash
# 1️⃣ Clone the repository
git clone https://github.com/Naveen-unni/BloodTracker.git
cd BloodTracker

# 2️⃣ Set up database (replace with your DB, user, password)
# Edit src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_db_name
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# 3️⃣ Build the project
mvn clean install

# 4️⃣ Run the project
mvn spring-boot:run
# OR
java -jar target/BloodTracker-0.0.1-SNAPSHOT.jar
