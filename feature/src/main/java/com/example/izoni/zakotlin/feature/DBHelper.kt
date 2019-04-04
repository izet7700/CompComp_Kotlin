package com.example.izoni.zakotlin.feature

import java.sql.*
import java.util.Properties

fun connectivity(){
    val username: String = "compdata"
    val password : String = "comp1*"
    val connectionProps = Properties()
    connectionProps.put("user", username)
    connectionProps.put("password", password)
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance()
        val conn: Connection = DriverManager.getConnection("jdbc:den1.mysql6.gear.host",connectionProps)
    } catch (ex: SQLException) {
        // handle any errors
        ex.printStackTrace()
    } catch (ex: Exception) {
        // handle any errors
        ex.printStackTrace()
    }
}