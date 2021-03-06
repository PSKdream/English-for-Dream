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
        Database db = new Database("jdbc:sqlite:data.db");
        db.connect();
        db.insert.insertData("Dream", "ความฝัน");
        db.close();
    }
}
```

#### Select Data For Table 
```java
public static void main(String[] args) {
        Database db = new Database("jdbc:sqlite:data.db");
        db.connect();
        ArrayList <Object> data = db.select.getTable();  //retrun ArrayList type Object
        db.close();
    }
}
```

#### Select Data For Column
```java
public static void main(String[] args) {
        Database db = new Database("jdbc:sqlite:data.db");
        db.connect();
        ArrayList <Object> data = db.select.getColumn("vocab"); //retrun ArrayList type Object
        db.close();
    }
}
```
#### Select Data For Row
```java
public static void main(String[] args) {
        Database db = new Database("jdbc:sqlite:data.db");
        db.connect();
        ArrayList <Object> data = db.select.getRow("vocab","Dream"); //retrun ArrayList type Object
        db.close();
    }
}
```
#### Select Query
```java
public static void main(String[] args) {
        Database db = new Database("jdbc:sqlite:data.db");
        db.connect();
        ArrayList <Object> data = db.select.query("SQL Command"); //retrun ArrayList type Object
        db.close();
    }
}
```
#### Delete
```java
public static void main(String[] args) {
        Database db = new Database("jdbc:sqlite:data.db");
        db.connect();
        db.delete.delete("text"); //delete WHERE vocab
        db.close();
    }
}
```


## Translate
Translate by Google API
#### Learning for Database
* https://github.com/google/gson
* https://search.maven.org/artifact/com.google.code.gson/gson/2.8.6/jar
```java
public static void main(String[] args) {
        Translate translator = new Translate("API KEY");
        String text = translator.translate("My name is Dream", "en", "th");
        System.out.println(text);
    }
}
```

## TTS
text to speech by free tts
```java
public static void main(String[] args) {
        TextToSpeech tts = new TextToSpeech();
        tts.speak("My name is Dream");
    }
}
```

