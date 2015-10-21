package app;

import java.util.Date;

public class UserHistory {
    private Date entryTime;
    private String entry;
    private int id;
    private User user;
    private java.sql.Date timestamp;

    public UserHistory() {}

    public UserHistory(Date entryTime, String entry) {
        super();
        this.entryTime = entryTime;
        this.entry = entry;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHistory that = (UserHistory) o;

        if (!entryTime.equals(that.entryTime)) return false;
        return entry.equals(that.entry);

    }

    @Override
    public int hashCode() {
        int result = entryTime.hashCode();
        result = 31 * result + entry.hashCode();
        return result;
    }

    public java.sql.Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(java.sql.Date timestamp) {
        this.timestamp = timestamp;
    }
}
