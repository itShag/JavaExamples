public class Advert {
    // Название - строка
    // Цена     - целое
    // Категория- строка
    // Состояние- строка
    // Описание - строка
    // Адрес    - строка
    // Контакт  - строка
    
    private String title;
    private int price;
    private String category;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
