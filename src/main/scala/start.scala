package start

import org.apache.log4j._
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions._
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by KoolmeisterE on 04/02/2016.
  *
  */
object start {


  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("graphX")
    val sc = new SparkContext(conf)
    val sqlContext = new org.apache.spark.sql.hive.HiveContext(sc)
    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("akka").setLevel(Level.OFF)

    sqlContext.setConf("spark.sql.parquet.binaryAsString", "true")
    sqlContext.setConf("spark.sql.parquet.compression.codec.", "snappy")
    val df = sqlContext.read.parquet("/path/to/data/in/hdfs")


  }

}
