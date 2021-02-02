package com.samples.fresher

import org.apache.spark.sql.{ SQLContext, SparkSession }
import org.apache.spark.{ SparkConf }
object ReadCSV extends App {

  val spark = SparkSession.builder()
    .master("local[1]")
    .appName("SparkByExamples.com")
    .getOrCreate();

  spark.sparkContext.setLogLevel("ERROR")

  val sqlContext: SQLContext = spark.sqlContext

  val df = sqlContext.read.options(Map("inferSchema" -> "true", "delimiter" -> ",", "header" -> "true"))
    .csv("src/main/resources/zipcodes.csv")
  df.show()

  df.groupBy("department").sum("salary").show(false)
  df.groupBy("department").count().show(false)
  df.printSchema()
  df.createOrReplaceTempView("TAB")
  sqlContext.sql("select * from TAB")
  .show(false)

}