# Observer
_"The Observer Pattern defines a one-to-many dependency between objects
so that when one object changes state, all of its dependents are updated automatically."_

The __Subject__ is the object whose state is to be observed.

__Observers__ are the objects who are dependent on the state of the Subject.

## Brief
- The WeatherData class has getter methods for three
measurement values: temperature, humidity, and
barometric pressure.

- The measurementsChanged() method is called any
time new weather measurement data is available (we
don’t know or care how this method is called; we just
know that it is).

- We need to implement three display elements that
use the weather data: a current conditions display,
a statistics display, and a forecast display. These
displays must be updated each time WeatherData has
new measurements.

- The system must be expandable — other developers
can create new custom display elements and users
can add or remove as many display elements as they
want to the application. Currently, we know about
only the initial three display types (current conditions,
statistics, and forecast).
