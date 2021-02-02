package com.samples.fresher.spark

import org.apache.spark.sql.{ DataFrame, SparkSession }
object WriteCSV extends App {

  val spark: SparkSession = SparkSession.builder()
    .master("local[1]")
    .appName("SparkByExample")
    .getOrCreate()

  var df: DataFrame = spark.read
    .option("header", "true")
    .csv("src/main/resources/spark_input/zipcodes.csv")

  df.write
    .mode("overwrite")
    .format("com.databricks.spark.csv")
    .option("header", "true")
    .csv("src/main/resources/spark_output")
}