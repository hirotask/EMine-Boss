package click.erudosaba.mc.emineboss.portal

import click.erudosaba.mc.emineboss.Main
import org.bukkit.Location
import org.bukkit.entity.ArmorStand
import org.bukkit.entity.EntityType

class Hologram(private val portal:Portal) {

    private val entity: ArmorStand
    private val location: Location
    var title: String
        get() = entity.customName.toString()
        set(value) {
            entity.customName = value
        }

    init {
        // TODO 一つのメソッドに処理をまとめたい(display())
        // Locationの計算
        location = middleLocation()

        // Entityの生成
        entity = portal.loc1.world?.spawnEntity(location, EntityType.ARMOR_STAND) as ArmorStand

        // Entityの設定
        // 不可視
        entity.isVisible = false
        // 重力無視
        entity.setGravity(false)
        // 無敵化
        entity.isInvulnerable = true
        // TODO 当たり判定の無効化
        entity

        // NameTagの付与
        entity.customName = portal.dungeon.name
        entity.isCustomNameVisible = true
    }

    // ホログラムを表示するメソッド
    fun display() {
        // TODO Location計算
        // TODO Entityの生成
        // TODO Entityの設定
        // TODO NameTagの付与
    }

    // isEnableがfalseになったときのメソッド
    fun setEnable() {
        // 稼働中はほぼ決定
        // 非稼働中は数分後に復活や、要メンテナンスなど、具体的なメッセージであるほうが好ましい
        title = if (portal.isEnable) "§f[§a稼働中§f] " + portal.dungeon.name
        else "§f[§4停止中§f] " + portal.dungeon.name
    }

    // ホログラムを削除するメソッド
    fun delete() {
        // Entityの削除
        entity.remove()
    }

    // EntityのLocationを計算するメソッド
    private fun middleLocation(): Location {
        val x: Double = getOneMiddle(portal.loc1.x, portal.loc2.x)
        val y: Double = getOneMiddle(portal.loc1.y, portal.loc2.y)
        val z: Double = getOneMiddle(portal.loc1.z, portal.loc2.z)
        // TODO y座標はいくらかさげたほうがいいかもしれない
        return Location(portal.loc1.world, x, y, z)
    }

    // loc1とloc2を比較して中間を計算するメソッド
    private fun getOneMiddle(loc1: Double, loc2: Double): Double {
        // TODO +0.5するかどうかは調査しなければならない
        return if (loc1 == loc2) loc1
        else if (loc1 > loc2) loc1 - loc2
        else loc2 - loc1
    }
}