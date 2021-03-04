package me.lab;


public class MusicBand implements Comparable<MusicBand> {

    private Integer id; // Автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long numberOfParticipants; //Значение поля должно быть больше 0
    private Long albumsCount; //Поле не может быть null, Значение поля должно быть больше 0
    private String description; //Поле может быть null
    private MusicGenre genre; //Поле не может быть null
    private Label label; //Поле не может быть null


    int getId() {
        return this.id;
    }


    public MusicBand() {
        
    }


    @Override
    public int compareTo(MusicBand arg) {
        if (this.id > arg.getId()) {
            return 1;
        } else if (this.id < arg.getId()) {
            return -1;
        } else {
            return 0;
        }
        
    }
}


class Coordinates {
    private Integer x; //Поле не может быть null
    private long y; //Максимальное значение поля: 110
}


class Label {
    
    private Long sales; //Поле может быть null, Значение поля должно быть больше 0
}

enum MusicGenre {
    MATH_ROCK,
    POST_PUNK,
    BRIT_POP;
}