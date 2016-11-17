package com.fyber

import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.{SparkConf, SparkContext}

object Main {
  def main(args: Array[String]) {
    val sparkContext = new SparkContext(new SparkConf())
    val hiveContext = new HiveContext(sparkContext)

    hiveContext.sql(
      """SELECT *
         FROM data_platform_warehouse.client_request_v1
         WHERE year = 2016 AND month = 10 AND day = 5 AND hour = 10 LIMIT 10
      """.stripMargin
    ).show()
  }
}
