package com.samples.fresher


import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}
object ReadCSV extends App{

val spark = SparkSession.builder()
    .master("local[1]")
    .appName("SparkByExamples.com")
    .getOrCreate();

  spark.sparkContext.setLogLevel("ERROR")
  val sqlContext:SQLContext = spark.sqlContext

  //read csv with options
  val df = sqlContext.read.options(Map("inferSchema"->"true","delimiter"->",","header"->"true"))
    .csv("src/main/resources/zipcodes.csv")
  df.show()
  df.printSchema()

  df.createOrReplaceTempView("TAB")
  sqlContext.sql("select * from TAB")
    .show(false)
    
//  val conf = new SparkConf().setAppName("sparkbyexamples.com").setMaster("local[1]")
//  val sparkContext = new SparkContext(conf)
//  val rdd = sparkContext.textFile("/src/main/resources/text/alice.txt")
//
//  sparkContext.setLogLevel("ERROR")
//
//  println("First SparkContext:")
//  println("APP Name :"+sparkContext.appName);
//  println("Deploy Mode :"+sparkContext.deployMode);
//  println("Master :"+sparkContext.master);
// // sparkContext.stop()
  
  
  
//  val spark = SparkSession.builder()
//    .master("local[1]")
//    .appName("SparkByExamples.com")
//    .getOrCreate();
//
//  spark.sparkContext.setLogLevel("ERROR")
//  val df = spark.read.option("header",true)
//   .csv("src/main/resources/zipcodes.csv")

}