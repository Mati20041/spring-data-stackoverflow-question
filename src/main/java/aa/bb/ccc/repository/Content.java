package aa.bb.ccc.repository;

import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "content")
public class Content {

    public Content() {
    }

    public Content(Long id, String name, String title, String description) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.description = description;
    }

    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String title;

    @NotNull
    private String description;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}