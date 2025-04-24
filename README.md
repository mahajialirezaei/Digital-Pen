#DIGITAL PEN


## اهداف تمرین
- پیاده‌سازی فیلدهای **private** و دسترسی به آن‌ها از طریق **getter** و **setter**.
- استفاده از **enum** برای تعیین رنگ قلم.


## مشخصات کلاس

### ۱. Color
یک `enum` به نام `Color` تعریف کنید که شامل رنگ‌های زیر باشد:

- `BLUE` (آبی)
- `RED` (قرمز)
- `YELLOW` (زرد)
- `GREEN` (سبز)

### ۲. کلاس `DigitalPen`
کلاس `DigitalPen` باید دارای فیلدهای زیر باشد:

| نوع داده | نام فیلد   | توضیح                         |
|----------|------------|-------------------------------|
| `Color`  | `color`    | رنگ قلم                       |
| `int`    | `fontSize` | اندازه فونت                   |
| `String` | `brand`    | برند قلم                      |

تمامی این فیلدها باید `private` باشند و برای هر کدام متدهای `getter` و `setter` نوشته شود.

### ۳. متد پیام غیرمستقیم رنگ
متدی به نام `String getMoodMessage()` در کلاس `DigitalPen` تعریف کنید که براساس رنگ فعلی قلم، یک پیام It's + Color را بازگرداند.  


| رنگ      | پیام برگشتی                                                |
|-----------|-------------------------------------------------------------|
| `BLUE`    | It's BLUE                               |
| `RED`     | It's RED                       |
| `YELLOW`  | It's YELLOW               |
| `GREEN`   | It's GREEN                     |

## مثال
```java
DigitalPen pen = new DigitalPen();
pen.setColor(Color.YELLOW);
System.out.println(pen.getMoodMessage());
```
