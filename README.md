# HibernateSQLite
Hibernate and SQLite

Auto-Generated Project in IntelliJ IDEA with Hibernate 5.2.3

To integrate with SQLite You must do 2 things:

1. Point to some Path with Your SQLite database (the database may not even exist) in hibernate.cfg.xml. In this example it is 
<property name="connection.url">jdbc:sqlite:C:/SQLite/chinook.db</property>

if database dont exist yet just use <property name="hbm2ddl.auto">create</property> in hibernate.cfg.xml.

2. Open Project Structure and Add Libraries using Maven:

com.enigmabridge:hibernate4-sqlite-dialect:0.1.2 - this provides SQLiteDialect class so in hibernate.cfg.xml You can write:   
<property name="hibernate.dialect">com.enigmabridge.hibernate.dialect.SQLiteDialect</property> (even its hibernate4 its working)

org.ops4j.pax.jdbc:pax-jdbc-sqlite:0.6.0 - this provides JDBC class so in hibernate.cfg.xml You can write:   
<property name="connection.driver_class">org.sqlite.JDBC</property>
