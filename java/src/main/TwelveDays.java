import java.util.*;

public class TwelveDays {
	  private final static String[] verse = new String[]{
	            "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n",
	            "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n",
	            "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
	            "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
	            "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
	            "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
	                    "and a Partridge in a Pear Tree.\n",
	            "On the seventh day of Christmas my true love gave to me: " +
	                    "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " +
	                    "two Turtle Doves, and a Partridge in a Pear Tree.\n",
	            "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking," +
	                    " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
	                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
	            "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, " +
	                    "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
	                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
	            "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, " +
	                    "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +
	                    "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " +
	                    "and a Partridge in a Pear Tree.\n",
	            "On the eleventh day of Christmas my true love gave to me: " +
	                    "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
	                    "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " +
	                    "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n",
	            "On the twelfth day of Christmas my true love gave to me: " +
	                    "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " +
	                    "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " +
	                    "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"};
	    static String verse(int verseNumber) {
	        return verse[verseNumber - 1];
	    }
	    static String verses(int startVerse, int endVerse) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = startVerse; i <= endVerse; i++) {
	            sb.append(verse(i));
	            if (i < endVerse) {
	                sb.append("\n");
	            }
	        }
	        return sb.toString();
	    }
	    static String sing() {
	        return verses(1, 12);
	    }

}
