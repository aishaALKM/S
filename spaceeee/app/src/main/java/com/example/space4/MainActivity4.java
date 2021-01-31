package com.example.space4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ArrayList<Inventionsjavaclass> invention = new ArrayList<>();

        Inventionsjavaclass a1 = new Inventionsjavaclass(R.drawable.skyliinn,"Ozmo was  designed to detect and learn all types of complex architecture while adapting to the changing environment.Ozmo can learn any building’s façade, detecting the nuances of complex architecture in order to create the most effective cleaning path while never missing a spot.","OZMO");
        Inventionsjavaclass a2 = new Inventionsjavaclass(R.drawable.rabb,"While traditional fire extinguishers are generally safe to use that doesn’t mean there aren’t some risks. Respiratory,skin or eye irritation are common issues if the tool is mishandled. Extinguishers contain ingredients that negatively impact the environment. But Rab’s fire extinguisher eliminates these issues.","Fire extinguisher RAB");
        Inventionsjavaclass a3 = new Inventionsjavaclass(R.drawable.smapnasa344,"The Soil Moisture Active Passive (SMAP) mission is an orbiting observatory that measures the amount of water in the surface soil everywhere on Earth. A detailed description can be found in the SMAP Handbook (PDF, 4.09 MB). It was launched in January 2015 and started operation in April 2015. ","SMAP");
        Inventionsjavaclass a4 = new Inventionsjavaclass(R.drawable.deserttteecc,"Desert Energy is simply the term for all energy produced in deserts. Deserts have been unproductive lands in the past, with no agriculture.DESERTEC is a plan to power Europe from solar power plants in Sahara desert.","DESERTEC");
        Inventionsjavaclass a5 = new Inventionsjavaclass(R.drawable.s,"Kai is a Natural User Interface (NUI) device powered by the VME which recognizes the movements of your hand and your finger positions to enable a seamlessly intuitive interaction experience.","Kai Gesture controller");
        Inventionsjavaclass a6 = new Inventionsjavaclass(R.drawable.network983,"Loon is pioneering the commercial application of cutting-edge, stratospheric technologies. Together, these innovations are adding a new layer to the global connectivity ecosystem, making it possible to connect billions of people in places no one thought possible. After years of development, these technologies are in production at scale around the world.","Loon 4G internet");
        Inventionsjavaclass a7 = new Inventionsjavaclass(R.drawable.water49,"The Edible water blobs consists of water surrounded by a jelly-like membrane made of brown algae and calcium chloride. The squishy but strong gel-like container decomposes after four to six weeks if not consumed. The inventors say this sustainable packaging alternative can hold any kind of liquid, including soft drinks.","Edible water blobs");
        Inventionsjavaclass a8 = new Inventionsjavaclass(R.drawable.spacetec54,"we created SPACE 3D, the most affordable 10.1” LCD SLA 3D Printer with large build volume, fast printing speed, and ultra-high resolution. SPACE 3D brings the quality and precision of SLA printing to the desktop and keeps it affordable and intuitive so that anyone can 3D print.","Space 3D printer");
        Inventionsjavaclass a9 = new Inventionsjavaclass(R.drawable.nasaglove45,"Researchers at the NASA Johnson Space Center (JSC) have designed and developed Robo-Glove, a wearable human grasp assist device, to help reduce the grasping force needed by an individual to operate tools for an extended time or when performing tasks having repetitive motion.","Robo glove");
        Inventionsjavaclass a10 = new Inventionsjavaclass(R.drawable.bioinncc,"3D bio printing of human tissue has been around since the early two-thousands. Nowadays scientists are in the midst of moving from printing tiny sheets of tissue to entire 3D organs. Whitch can solve the issue of medical treatments in the near future, serving as a crucial development in both the medical and bioprinting fields.","Bio inc");
        Inventionsjavaclass a11 = new Inventionsjavaclass(R.drawable.sleepstoper567,"The principle of the StopSleep device is based on the continuous analysis and measurement of skin conductivity using eight built in electrodermal sensors. It can alerts the driver with an audible tone and vibration for 2-5 minutes before sleep. Also it has been tested in Europe by CNRS – The National Centre for Scientific Research.","Stop Sleep");
        Inventionsjavaclass a12 = new Inventionsjavaclass(R.drawable.sleepgeniusss," People with sleep problems are seeking natural alternatives to reclaim their sleep health, and need solutions that allow them to track and treat the control center of sleep, the brain. It provides a clinical level of support to help those suffering from sleep problems get the relief they need. Our company is focused on answering the call to help more people sleep batter.","Sleep Genius");
        Inventionsjavaclass a13 = new Inventionsjavaclass(R.drawable.black3456,"GDU O2 is designed for everyone, combining extreme portability, 4K camera with high resolution image capturing and 3 axis stable video capturing, advanced sensors and onboard computing capability and ease of use, to be the go-to option for your everyday drone.","GDU O2");


        invention.add(a1);
        invention.add(a2);
        invention.add(a3);
        invention.add(a4);
        invention.add(a5);
        invention.add(a6);
        invention.add(a7);
        invention.add(a8);
        invention.add(a9);
        invention.add(a10);
        invention.add(a11);
        invention.add(a12);
        invention.add(a13);

        RecyclerView rv = findViewById(R.id.rvh);
        rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        SpaceAdapter sa = new SpaceAdapter(invention,this);
        rv.setAdapter(sa);






    }
}