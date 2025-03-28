package Jjava.external;

import java.util.Date;

public class Alien {
    private String seenBy;
    private Date seenDate;
    private String description;

    public Alien(String seenBy, Date seenDate, String description) {
        this.seenBy = seenBy;
        this.seenDate = seenDate;
        this.description = description;
    }

    public String getSeenBy()
    {
        return seenBy;
    }
    public void setSeenBy(String seenBy)
    {
        this.seenBy = seenBy;
    }

    public Date getSeenDate() { return seenDate; }
    public void setSeenDate(Date seenDate) { this.seenDate = seenDate; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}

