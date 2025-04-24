## DIGITAL PEN

### اهداف تمرین

- پیاده‌سازی فیلدهای **private** و دسترسی به آن‌ها از طریق **getter** و **setter**.
- استفاده از **enum** برای تعیین رنگ قلم.
- تعیین ارزش قلم نوری بر اساس برند.

### مشخصات کلاس

#### ۱. `Color` Enum

تعریف یک enum با مقادیر زیر:
- `BLUE`
- `RED`
- `YELLOW`
- `GREEN`

#### ۲. کلاس `DigitalPen`

دارای فیلدهای خصوصی:
- `Color color`
- `int fontSize`
- `String brand`

و متدهای:
- `getColor()` / `setColor(Color)`
- `getFontSize()` / `setFontSize(int)`
- `getBrand()` / `setBrand(String)`
- `String getMoodMessage()` — خروجی بر اساس رنگ قلم (مثلاً: "It's BLUE")
- `String getDigitalPenValue()` — خروجی بر اساس برند قلم:

| برند      | پیام بازگشتی   |
|-----------|----------------|
| huion     | Fantastic      |
| xp pen    | Good           |
| ugee      | Normal         |
| سایر برندها | Bad           |

### مثال:

```java
DigitalPen pen = new DigitalPen();
pen.setColor(Color.YELLOW);
pen.setBrand("huion");
System.out.println(pen.getMoodMessage());       // It's YELLOW
System.out.println(pen.getDigitalPenValue());   // Fantastic
