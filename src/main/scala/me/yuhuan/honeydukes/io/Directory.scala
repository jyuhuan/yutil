package me.yuhuan.honeydukes.io

import java.io.File

/**
 * Created by Yuhuan Jiang (jyuhuan@gmail.com) on 3/11/15.
 */
object Directory {
  def allFiles(pathToDirectory: String): Traversable[java.io.File] = {
    new java.io.File(pathToDirectory).listFiles()
  }

  def allFilesWithExtension(pathToDirectory: String, extension: String): Traversable[java.io.File] = {
    new java.io.File(pathToDirectory).listFiles().filter(f ⇒ f.getName.endsWith(extension))
  }

  def allSubdirectories(pathToDirectory: String): Traversable[java.io.File] = {
    new java.io.File(pathToDirectory).listFiles().filter(f ⇒ f.isDirectory)
  }

  def createIfNotExist(pathToDirectory: String) = {
    val dir = new File(pathToDirectory)
    if (!dir.exists()) dir.mkdir()
  }

  def exists(pathToDirectory: String): Boolean = new File(pathToDirectory) exists

}
