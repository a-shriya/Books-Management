package com.example.booksmanagement.adapter;

public class Books
{
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public int getDrawableResource() {
        return drawableResource;
    }

    public void setDrawableResource(int drawableResource) {
        this.drawableResource = drawableResource;
    }

    public Books(String title, String description, String author, String imageUri, int pages, int review, int drawableResource)
    {
        this.title = title;
        this.description = description;
        this.author = author;
        this.imageUri = imageUri;
        this.pages = pages;
        this.review = review;
        this.drawableResource = drawableResource;
    }

    private String title;
    private String description;
    private String author;
    private String imageUri;
    private int pages,review;

    public Books(int drawableResource)
    {
        this.drawableResource = drawableResource;
    }

    private int drawableResource;

    public Books()
    {
    }
}
