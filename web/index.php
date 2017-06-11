<!DOCTYPE html>
<!--
TODO


-->


<?php

//Mainainence Mode ... put onto 1
$MaintainanceMode = 0;

if (!isset($_GET['page'])) {
    header('Location: /main');
    exit();

}

ini_set('display_errors', 'Off');
include "Templates/Connection.php";

switch ($_GET['page']) {
    case 'main':
        $page = getTemplate('main.php', array('user'=>$user));
        echo $page;
        break;
}



?>
