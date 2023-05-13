/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Book {
    private String title;
    private int pages;
    private int publicationYear;
    public Book(String ini_title, int ini_pages, int ini_publicationYear){
        this.title = ini_title;
        this.pages = ini_pages;
        this.publicationYear = ini_publicationYear;
    }
    public String getName(){
        return this.title;
    }
    
    public String toString(String type){
        if(type.equals("everything")){
            return this.title + ", " + this.pages + " pages, " 
                    + this.publicationYear;
        }
        if(type.equals("name")){
            return this.title;
        }
        return "";
    }
}
