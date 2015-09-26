# Date

## Obtaining the integers of year, month and day from a Date object
1 Create a Calendar object 
2 Use a Date to configure the Calendar
3 Retrieve the required information from the Calendar

```java
// Get the date from the bundle arguments.
Date date = (Date) getArguments().getSerializable(ARG_DATE);

// Get year, month and day for the date.
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
int year  = calendar.get(Calendar.YEAR);
int month = calendar.get(Calendar.MONTH);
int day   = calendar.get(Calendar.DAY_OF_MONTH);
```

## Converting the integers of year, month and day to a Date object
```java
// Get year, month and day from the DatePicker.
int year  = mDatePicker.getYear();
int month = mDatePicker.getMonth();
int day   = mDatePicker.getDayOfMonth();

// Create a Date object based on the year, month and day.
Date date = new GregorianCalendar(year, month, day).getTime();
```
