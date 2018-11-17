# device-owner-sample

### デバイスオーナーの有効化

下記コマンドを実行することでデバイスオーナー機能を有効化できます。

`adb shell dpm set-device-owner [パッケージ名]/[DeviceAdminReceiver.javaのパス]`

このサンプルの場合下記コマンドを実行することでデバイスオーナー権限を有効化することができます。

```
adb shell dpm set-device-owner com.example.nakata.deviceownersample/com.example.nakata.deviceownersample.Admin
```

（※ デバイスオーナー権限を有効化するには、アカウントを追加する前に実行する必要があります。また、端末内でデバイスオーナーになれるアプリは一つです）
