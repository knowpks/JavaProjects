// This exercise is about adding, removing, swaping index of song

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Everglow - Coldplay");
    desertIslandPlaylist.add("Sunrise - Norah Jone");
    desertIslandPlaylist.add("Be Alright - Dean Lewis");
    desertIslandPlaylist.add("Flowers - Miley Cyrus");
    desertIslandPlaylist.add("Can't Feel My Face");
    desertIslandPlaylist.add("Your song - Elton John");

    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove(5);
    System.out.println(desertIslandPlaylist.size());

    // Swap Song
    
    int index1 = desertIslandPlaylist.indexOf("Sunrise - Norah Jone");
    int index2 = desertIslandPlaylist.indexOf("Be Alright - Dean Lewis");
    System.out.println(index1);
    System.out.println(index2);
    String tempA = desertIslandPlaylist.get(index1);
    System.out.println(tempA);

    String tempB = desertIslandPlaylist.get(index2);
    System.out.println(tempB);

    desertIslandPlaylist.set(index1, tempB);
    desertIslandPlaylist.set(index2, tempA);

    System.out.println(desertIslandPlaylist);
  }

}
