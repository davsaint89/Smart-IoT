<?php
$nombre = $_POST['nombre'];
$mail = $_POST['email'];
$empresa = $_POST['mensaje'];

$header = 'From: ' . $mail . " \r\n";
$header .= "X-Mailer: PHP/" . phpversion() . " \r\n";
$header .= "Mime-Version: 1.0 \r\n";
$header .= "Content-Type: text/plain";

$mensaje = "Este mensaje fue enviado por " . $nombre . ",\r\n";
$mensaje .= "Su e-mail es: " . $mail . " \r\n";
$mensaje .= "Mensaje: " . $_POST['mensaje'] . " \r\n";
$mensaje .= "Enviado el " . date('d/m/Y', time());
/* sgutierrez@usbbog.edu.co */
$para = 'vsebastian@academia.usbbog.edu.co';
$asunto = 'Nuevo mienbro PIICO';

mail($para, $asunto, utf8_decode($mensaje), $header);

header("Location:/");
?>