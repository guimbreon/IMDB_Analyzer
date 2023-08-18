
# IMDb Movie Ratings Analyzer

The idea behind this Java project is to make it possible for everyone 
that has an [IMDB](https://www.imdb.com/) account to analyze their data.



## Table of Contents

- [Introduction](#introduction)
- [How to get the DATA](#how-to-get-the-data)
- [Features](#features)
- [Usage](#usage)
- [Installation](#installation)
- [Example with Menu](#example_with_menu)
- [Example without Menu](#example_without_menu)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project consists of some Java classes, `Calculator`, `Reading` and `Menu`, designed to process IMDb movie ratings CSV data and calculate the mean of the rating column.

- `Calculator`: This class contains methods to calculate things with the IMDb CSV data and print the result, here you can see what:
  - [Features](#features)
- `Reading`: This class provides a method to read IMDb movie ratings CSV data from a file and return it as a list of string arrays.

## How to get the data

1. Go to [IMDB](https://www.imdb.com/) website.
2. Login in your account.
3. Click on your profile (Top right) and click in "Your Ratings".
4. Click on the 3 dots and then "Export".
5. Just use my program!

You have an example data in this file : [dataExample](dataExample).

## Features

Here are some things you can do with the program using the [Menu](#example_with_menu):
1. 


## Usage

The code given in this project can be used in two ways:
1. Using the [Menu](imdb/src/Menu.java), for an easier exploration of your data.
2. By using the functions i build in a separate program elaborated
by yourself. If you are planning to do this, 
don't forget to give credits.

To use the functionalities provided by this project, follow these steps:

1. Ensure you have Java installed on your system.
2. Include all the file in this [file](imdb/src)
 in your Java project.
3. Get the [data](#how-to-get-the-data) from your IMDB profile.

## Installation

1. Clone this repository or download the `Calculator.java` and `Reading.java` files.
2. Include the downloaded files in your Java project.
3. Follow the usage instructions to incorporate the IMDb movie ratings functionality into your project.

## Example with Menu

Just run the following commands in the folder ./imdb/src:


```terminal
javac Menu.java
java Menu
```
Don't forget that your terminal must be located where
the file Menu.java is.

## Example without Menu

Here's an example of how you can use the `Calculator` and `Reading` classes in your Java code:

```java
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String imdbCsvFilePath = "imdb_ratings.csv"; // Replace with your IMDb ratings CSV file path
        List<String[]> imdbCsvData = Reading.readFile(imdbCsvFilePath);

        Calculator myMean = new Calculator();
        myMean.calculateMean(csvData);
        myMean.print();
    }
}
```

## Contributing

Contributions to this project are welcome! If you find any issues or have suggestions for improvements, feel free to create a pull request.

---
## License
This project is licensed under the [GNU License](LICENSE).

