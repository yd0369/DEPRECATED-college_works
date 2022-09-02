<?php   
  require('fpdf.php'); 
  $pdf = new FPDF(); 
  $pdf->AddPage();
  $pdf->SetTitle("Yash Desai PDF"); 
  $X = ($pdf->GetPageWidth()/2);
  $Y = ($pdf->GetPageHeight()/2);
  $pdf->SetFont("helvetica", '', 10);
  $pdf->Text($X,$Y,"Yash Desai");
  $pdf->SetFont("courier", "IBU", 35);
  $pdf->SetFillColor(0,255,69);
  $pdf->SetTextColor(255,255,255);
  $pdf->Cell( 100, 30, 'Yash Desai', 40 , 0,'C',true);
  $pdf->Output(); 
?>