# HibernateSQLite
Hibernate and SQLite

Auto-Generated Project in IntelliJ IDEA with Hibernate 5.2.3

To integrate with SQLite do 2 things:

- Point to Path with Your SQLite database (the database may not even exist) in **hibernate.cfg.xml**. In this example it is 
**<property name="connection.url">jdbc:sqlite:C:/SQLite/chinook.db</property>**

if database dont exist yet use **<property name="hbm2ddl.auto">create</property>** in **hibernate.cfg.xml.**

- Open Project Structure and Add Libraries using Maven:

search for com.enigmabridge:hibernate - this provides SQLiteDialect class in hibernate.cfg.xml:   
**<property name="hibernate.dialect">com.enigmabridge.hibernate.dialect.SQLiteDialect</property>** (even its hibernate4 its working)

search for org.xerial:sqlite - this provides JDBC class in hibernate.cfg.xml:
**<property name="connection.driver_class">org.sqlite.JDBC</property>**
