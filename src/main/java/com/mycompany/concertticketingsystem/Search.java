package com.mycompany.concertticketingsystem;

import java.util.List;

/**
 *
 * @author Joshua Koh
 */
public interface Search {
   public Concert[] searchByTitle(String title);
   public Concert[] searchByLanguage(String language);
   public Concert[] searchByDate(String date);
   public Concert[] searchByArtist(String artist);
   public Concert[] searchByVenue(String venue);    
}
