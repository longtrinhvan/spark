package com.samples.fresher

import org.apache.spark.sql.{ SQLContext, SparkSession }
import org.apache.spark.{ SparkConf }
object ReadPinot extends App {
  val spark: SparkSession = SparkSession
    .builder()
    .appName("spark-pinot-connector-test")
    .master("local")
    .getOrCreate()

  val df = spark.read.format("pinot").option("table", "testNghia")
    .option("tableType", "offline")
    .option("controller", "ctrl-pinot-devq9-prox-6-120:9000")
    .option("broker", "broker-pinot-devq9-prox-6-121:7000")
    .option("segmentsPerSplit", "1")
    .option("usePushDownFilters", "false")
    .load()
  df.printSchema()
}