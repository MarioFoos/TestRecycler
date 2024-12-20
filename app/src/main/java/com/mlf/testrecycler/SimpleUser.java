package com.mlf.testrecycler;

public class SimpleUser
{
    private final String name;
    private final String email;
    private final int image;

    public SimpleUser(String text, String email, int image)
    {
        this.name = text;
        this.email = email;
        this.image = image;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public int getImage()
    {
        return image;
    }
}
