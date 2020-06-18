# English-for-Dream
Project Java OOP (IT59118) <br/>
Computer Engineering , Panyapiwat Institute Of Management

## Database 

Table : DATA
Column | Type | Schema
----- | ----- | ----- |
ID | INTEGER | PK , AUTOINCREMENT |
vocab | TEXT | NOT NULL , UNIQUE |
meaning | TEXT | NOT NULL |

##### Database Power SQlite
SQlite JAR File : https://bitbucket.org/xerial/sqlite-jdbc/downloads/

#### Learning for Database
* https://www.tutorialspoint.com/sqlite/sqlite_java.htm
* https://www.thaicreate.com/tutorial/sql.html

## Database Class
#### Insert Data
```java
public static void main(String[] args) {
        Insert db = new Insert();
        db.connect();
        db.insertData("Dream", "ความฝัน");
        db.close();
    }
}
```

#### Select Data For Table 
```java
public static void main(String[] args) {
        Select db = new Select();
        db.connect();
        ArrayList <Object> data = db.getTable();  //retrun ArrayList type Object
        db.close();
    }
}
```

#### Select Data For Column
```java
public static void main(String[] args) {
        Select db = new Select();
        db.connect();
        ArrayList <Object> data = db.getColumn("vocab"); //retrun ArrayList type Object
        db.close();
    }
}
```
#### Select Data For Row
```java
public static void main(String[] args) {
        Select db = new Select();
        db.connect();
        ArrayList <Object> data = db.getRow("vocab","Dream"); //retrun ArrayList type Object
        db.close();
    }
}
```
