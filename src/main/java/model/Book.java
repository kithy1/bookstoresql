package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private Integer id;
    private String title;
    private Integer pageNumbeer;
    private Integer isbn;
    private Integer categoryId;
    private Integer publisherId;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pageNumbeer=" + pageNumbeer +
                ", isbn=" + isbn +
                ", categoryId=" + categoryId +
                ", publisherId=" + publisherId +
                '}'+"\n";
    }
}
